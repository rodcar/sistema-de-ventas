/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.daos;

import java.util.ArrayList;
import pe.kawaii.ventas.models.Producto;

/**
 *
 * @author EDITA
 */
public class ProductoDAO {

    public ArrayList<Producto> findAll() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Producto A"));
        productos.add(new Producto("Producto B"));
        productos.add(new Producto("Producto C"));
        return productos;
    }
    
}
