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
import pe.kawaii.ventas.models.Rol;
import pe.kawaii.ventas.models.Usuario;

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
    public void save(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
