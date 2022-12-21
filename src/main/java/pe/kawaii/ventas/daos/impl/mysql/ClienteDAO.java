package pe.kawaii.ventas.daos.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IClienteDAO;
import pe.kawaii.ventas.db.DbConn;
import pe.kawaii.ventas.models.Cliente;
import pe.kawaii.ventas.models.Rol;

public class ClienteDAO implements IClienteDAO {
    
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<Cliente> lista;
    
    public ClienteDAO() {
        lista = new ArrayList<>();
    }

    @Override
    public void save(Cliente u) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert into clientes values(null, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getDni());
            ps.setString(3, u.getRuc());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getCelular());
            ps.setString(6, u.getDireccion());

            ps.executeUpdate();
            System.out.println("Cliente Grabado");
        } catch (SQLException ex) {
            System.out.println("error de conexion: " + ex);
        }
    }

    @Override
    public void update(Cliente u) {
        
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("update clientes set nombre_completo=?,dni=?,ruc=?,correo=?,celular=?,direccion=? where id=?");
            ps.setInt(8, u.getId());
            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getDni());
            ps.setString(4, u.getRuc());
            ps.setString(5, u.getCorreo());
            ps.setString(6, u.getCelular());
            ps.setString(7, u.getDireccion());
            ps.executeUpdate();
            System.out.println("Cliente actualizado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
        
    }

    @Override
    public Optional<ArrayList<Cliente>> findAll() {
        try {
        cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from clientes");
            rs = ps.executeQuery();
            lista.clear();
            while (rs.next()) {
                lista.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre_completo"),
                        rs.getString("dni"),
                        rs.getString("ruc"),
                        rs.getString("correo"),
                        rs.getString("celular"),
                        rs.getString("direccion"))
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
       try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("delete from clientes where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Cliente Eliminado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        } 
    }

    @Override
    public Optional<Cliente> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
