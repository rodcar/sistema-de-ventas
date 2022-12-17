/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.util.List;
import java.util.Optional;
import pe.kawaii.ventas.models.Venta;
import pe.kawaii.ventas.services.VentaService;

/**
 *
 * @author Ivan
 */
public class VentaController {

    private VentaService ventaService;

    public VentaController() {
        this.ventaService = new VentaService();
    }

    public Optional<List<Venta>> findAll() {
        return this.ventaService.findAll();
    }

    public void registrarVenta(Venta venta) {
        this.ventaService.save(venta);
    }

    public void actualizarVenta(Venta venta) {
        this.ventaService.update(venta);
    }

    public void anularVenta(Venta venta) {
        this.ventaService.anular(venta);
    }

}
