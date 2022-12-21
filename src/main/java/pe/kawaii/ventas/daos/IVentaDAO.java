/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.kawaii.ventas.daos;

import pe.kawaii.ventas.models.Venta;
import pe.kawaii.ventas.models.VentaDetalle;

/**
 *
 * @author Ivan
 */
public interface IVentaDAO extends ICrudDAO<Venta> {

    public void saveDetalle(int ventaId, VentaDetalle d);
    
    public int saveVenta(Venta v);
    
}
