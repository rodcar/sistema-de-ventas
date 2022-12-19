package pe.kawaii.ventas.daos.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IUsuarioDAO;
import pe.kawaii.ventas.db.DbConn;
import pe.kawaii.ventas.models.Usuario;

/**
 *
 * @author Ivan
 */
public class UsuarioDAO implements IUsuarioDAO {

    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public void save(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean login(String username, String password) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from usuarios where username=? and password=md5(?)");
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            int rowCounter = 0;
            if (rs.next()) {
                rowCounter++;
            }

            if (rowCounter == 1) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
        return false;
    }

}
