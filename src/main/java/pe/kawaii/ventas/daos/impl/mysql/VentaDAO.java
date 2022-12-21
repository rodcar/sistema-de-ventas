package pe.kawaii.ventas.daos.impl.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.kawaii.ventas.daos.IVentaDAO;
import pe.kawaii.ventas.db.DbConn;
import pe.kawaii.ventas.models.Cliente;
import pe.kawaii.ventas.models.Rol;
import pe.kawaii.ventas.models.Usuario;
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
        try {
            cn = DbConn.getConnection();
            ps = cn.prepareStatement("select ventas.*, clientes.nombre_completo, usuarios.username from ventas join clientes on ventas.cliente_id = clientes.id join usuarios on ventas.usuario_id = usuarios.id");
            rs = ps.executeQuery();
            lista.clear();
            while (rs.next()) {
                Usuario v = new Usuario();
                v.setId(rs.getInt("usuario_id"));
                v.setUsername(rs.getString("username"));
                Cliente c = new Cliente();
                c.setId(rs.getInt("cliente_id"));
                c.setNombreCompleto(rs.getString("nombre_completo"));
                ArrayList<VentaDetalle> detalles = new ArrayList<>();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fechaRegistro = rs.getString("fecha_registro");
                try {
                    Date registro = sdf.parse(fechaRegistro);
                    Venta nv = new Venta(rs.getInt("id"), v, c, detalles, registro, rs.getDouble("total"));
                    nv.setAnulada(rs.getBoolean("anulada"));
                    lista.add(nv);
                } catch (ParseException ex) {
                    Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
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
            ps = cn.prepareStatement("update ventas set anulada=? where id=?");
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Usuario actualizado");
        } catch (SQLException ex) {
            System.out.println("error de conexion");
        }
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
