package pe.kawaii.ventas.daos.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IProductoDAO;
import pe.kawaii.ventas.db.DbConn;
import pe.kawaii.ventas.models.Producto;

/**
 *
 * @author EDITA
 */
public class ProductoDAO implements IProductoDAO {

    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<Producto> lista;

    public ProductoDAO() {
        lista = new ArrayList<>();
    }

    @Override
    public void save(Producto p) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert into productos values(null, ?, ?, ?, ?)");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.executeUpdate();
            System.out.println("Producto Grabado");
        } catch (SQLException ex) {
            System.out.println("error de conexion: " + ex);
        }
    }

    @Override
    public void update(Producto p) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("update productos set nombre=?,descripcion=?,precio=?,stock=? where id=?");
            ps.setInt(5, p.getId());
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.executeUpdate();
            System.out.println("Producto actualizado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
    }

    @Override
    public Optional<Producto> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ArrayList<Producto>> findAll() {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select * from productos");
            rs = ps.executeQuery();
            lista.clear();
            while (rs.next()) {
                lista.add(new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"), rs.getDouble("precio"), rs.getInt("stock"))
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
            ps = cn.prepareStatement("delete from productos where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Cliente Eliminado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
    }

}
