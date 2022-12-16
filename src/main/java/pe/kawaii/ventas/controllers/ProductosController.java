/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.util.ArrayList;
import pe.kawaii.ventas.models.Producto;
import pe.kawaii.ventas.services.ProductoService;

/**
 *
 * @author EDITA
 */
public class ProductosController {
    
    private ProductoService productoService;

    public ProductosController() {
        this.productoService = new ProductoService();
        
    }
    

    public ArrayList<Producto> findAll() {
        return productoService.findAll();
    }
   
}
