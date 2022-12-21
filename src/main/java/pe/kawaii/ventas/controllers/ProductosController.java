/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import pe.kawaii.ventas.models.Producto;
import pe.kawaii.ventas.services.ProductoService;

/**
 *
 * @author EDITA
 */
public class ProductosController {

    private static ProductoService productoService = new ProductoService();

    public static Optional<ArrayList<Producto>> findAll() {
        return productoService.findAll();
    }

}
