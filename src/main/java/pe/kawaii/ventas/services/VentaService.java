/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.services;

import java.util.List;
import java.util.Optional;
import pe.kawaii.ventas.daos.VentaDAO;
import pe.kawaii.ventas.models.Venta;

/**
 *
 * @author Ivan
 */
public class VentaService implements CrudService<Venta> {
    
    private VentaDAO ventaDAO;
    
    public VentaService() {
        ventaDAO = new VentaDAO();
    }
    
    public VentaService(VentaDAO ventaDAO) {
        this.ventaDAO = ventaDAO;
    }
    
    @Override
    public void save(Venta t) {
        this.ventaDAO.save(t);
    }
    
    @Override
    public void update(Venta t) {
        this.ventaDAO.update(t);
    }
    
    @Override
    public Optional<Venta> findById(int id) {
        return this.ventaDAO.findById(id);
    }
    
    @Override
    public Optional<List<Venta>> findAll() {
        return this.ventaDAO.findAll();
    }
    
    @Override
    public void delete(int id) {
        this.ventaDAO.delete(id);
    }
    
    public void anular(Venta venta) {
        venta.setAnulada(true);
        this.ventaDAO.update(venta);
    }
    
}
