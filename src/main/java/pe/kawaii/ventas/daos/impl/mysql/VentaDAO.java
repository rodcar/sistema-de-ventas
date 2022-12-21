package pe.kawaii.ventas.daos.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IVentaDAO;
import pe.kawaii.ventas.db.DbConn;
import pe.kawaii.ventas.models.Venta;
import pe.kawaii.ventas.models.VentaDetalle;

/**
 *
 * @author Ivan
 */
public class VentaDAO implements IVentaDAO {

    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<Venta> lista;

    public VentaDAO() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void save(Venta v) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert into ventas values(null, ?, ?, now(), ?, false)");
            ps.setInt(1, v.getVendedor().getId());
            ps.setInt(2, v.getCliente().getId());
            ps.setDouble(3, v.getTotal());
            ps.executeUpdate();
            System.out.println("Venta Grabada");
        } catch (SQLException ex) {
            System.out.println("error de conexion: " + ex);
        }
    }

    @Override
    public void update(Venta t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Venta> findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ArrayList<Venta>> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveDetalle(int ventaId, VentaDetalle d) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert into detalles values(null, ?, ?, ?, ?, ?)");
            ps.setInt(1, ventaId);
            ps.setInt(2, d.getProducto().getId());
            ps.setInt(3, d.getCantidad());
            ps.setDouble(4, d.getPrecioUnitario());
            ps.setDouble(5, d.getSubtotal());
            ps.executeUpdate();
            System.out.println("Venta detalle Grabada");
        } catch (SQLException ex) {
            System.out.println("error de conexion: " + ex);
        }
    }

    @Override
    public int saveVenta(Venta v) {
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("insert into ventas values(null, ?, ?, now(), ?, false)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, v.getVendedor().getId());
            ps.setInt(2, v.getCliente().getId());
            ps.setDouble(3, v.getTotal());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                //what you get is only a RowId ref, try make use of it anyway U could think of
                return id;
            }
            System.out.println("Venta Grabada");
        } catch (SQLException ex) {
            System.out.println("error de conexion: " + ex);
        }
        return -1;
    }

}
