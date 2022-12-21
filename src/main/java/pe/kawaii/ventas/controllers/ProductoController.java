/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.models.Producto;
import pe.kawaii.ventas.services.ProductoService;

/**
 *
 * @author EDITA
 */
public class ProductoController {

    private static ProductoService productoService = new ProductoService();

    public static Optional<ArrayList<Producto>> findAll() {
        return productoService.findAll();
    }

    public static void eliminar(int id) {
        productoService.delete(id);
    }

    public static void guardar(Producto producto) {
        productoService.save(producto);
    }

    public static void actualizar(Producto producto) {
        productoService.update(producto);
    }

}
