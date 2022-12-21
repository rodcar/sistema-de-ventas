/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.util.ArrayList;
import java.util.Optional;
import pe.kawaii.ventas.models.Usuario;
import pe.kawaii.ventas.services.UsuarioService;

/**
 *
 * @author BRYAN
 */
public class UsuarioController {

    private static UsuarioService usuarioService = new UsuarioService();

    public static Optional<ArrayList<Usuario>> getAll() {
        return usuarioService.findAll();
    }

    public static void registrar(Usuario u) {
        usuarioService.save(u);
    }

    public static void eliminar(int id) {
        usuarioService.delete(id);
    }

    public static void actualizar(Usuario usuario) {
        usuarioService.update(usuario);
    }

}
