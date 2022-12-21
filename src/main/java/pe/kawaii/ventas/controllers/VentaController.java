/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import pe.kawaii.ventas.models.Producto;
import pe.kawaii.ventas.models.Venta;
import pe.kawaii.ventas.services.ProductoService;
import pe.kawaii.ventas.services.VentaService;

/**
 *
 * @author Ivan
 */
public class VentaController {

    private static VentaService ventaService = new VentaService();
    private static ProductoService productoService = new ProductoService();

    public static Optional<ArrayList<Venta>> findAll() {
        return ventaService.findAll();
    }

    public static void registrarVenta(Venta venta) {
        ventaService.save(venta);
    }

    public void actualizarVenta(Venta venta) {
        this.ventaService.update(venta);
    }

    public static void anularVenta(int id) {
        ventaService.anular(id);
    }

    public static Optional<Producto> buscarProductoPorId(String codigo) {
        System.out.println(Integer.parseInt(codigo));
        return productoService.findById(Integer.parseInt(codigo));
    }

}
