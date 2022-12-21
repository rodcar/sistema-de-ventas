package pe.kawaii.ventas.controllers;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.models.Cliente;
import pe.kawaii.ventas.services.ClienteService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author BRYAN
 */
public class ClienteController {
    
    private static ClienteService clienteService = new ClienteService();
    
    public static void registrar(Cliente cliente) {
        clienteService.save(cliente);
    }
    
    public static Optional<ArrayList<Cliente>> getAll() {
        return clienteService.findAll();
    }
    
    public static void eliminar(int id) {
        clienteService.delete(id);
    }
    
    public static void actualizar(Cliente cliente) {
        clienteService.update(cliente);
    }
    
}
