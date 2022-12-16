/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.services;

import java.util.ArrayList;
import pe.kawaii.ventas.daos.ProductoDAO;
import pe.kawaii.ventas.models.Producto;

/**
 *
 * @author EDITA
 */
public class ProductoService {
    
    private ProductoDAO productoDAO;

    public ProductoService() {
        productoDAO = new ProductoDAO();
    }
  
    public ArrayList<Producto> findAll() {
        return productoDAO.findAll();
    }
    
}
