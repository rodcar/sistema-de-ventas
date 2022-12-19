/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.services;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.daos.IVentaDAO;
import pe.kawaii.ventas.daos.impl.DaoFactory;
import pe.kawaii.ventas.daos.impl.mysql.VentaDAO;
import pe.kawaii.ventas.models.Venta;
import pe.kawaii.ventas.util.Util;

/**
 *
 * @author Ivan
 */
public class VentaService implements CrudService<Venta> {

    private IVentaDAO ventaDAO;

    public VentaService() {
        this.ventaDAO = DaoFactory.getVentaDAO(Util.dataSource);
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
    public Optional<ArrayList<Venta>> findAll() {
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
