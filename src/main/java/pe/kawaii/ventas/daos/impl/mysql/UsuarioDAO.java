package pe.kawaii.ventas.daos.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import pe.kawaii.ventas.daos.IUsuarioDAO;
import pe.kawaii.ventas.db.DbConn;
import pe.kawaii.ventas.models.Rol;
import pe.kawaii.ventas.models.Usuario;

/**
 *
 * @author Ivan
 */
public class UsuarioDAO implements IUsuarioDAO {

    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<Usuario> lista;

    public UsuarioDAO() {
        lista = new ArrayList<>();
    }

    @Override
    public void save(Usuario u) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert into usuarios values(null, ?, ?, ?, ?)");
            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            ps.setInt(4, u.getRol().ordinal());
            ps.executeUpdate();
            System.out.println("Curso Grabado");
        } catch (SQLException ex) {
            System.out.println("error de conexion: " + ex);
        }
    }

    @Override
    public void update(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Usuario> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ArrayList<Usuario>> findAll() {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from usuarios");
            rs = ps.executeQuery();
            lista.clear();
            while (rs.next()) {
                lista.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("username"),
                        rs.getString("password"),
                        (rs.getInt("rol_id") == 0) ? Rol.ADMINISTRADOR : Rol.VENDEDOR)
                );
            }
            return Optional.of(lista);
        } catch (SQLException ex) {
            System.out.println("error de conexion");
            return Optional.empty();
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Usuario> login(String username, String password) {
        Usuario usuario = null;
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from usuarios where username=? and password=md5(?)");
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setRol(Rol.values()[rs.getInt("rol_id")]);
                return Optional.of(usuario);
            }

        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
        return Optional.empty();
    }

}
