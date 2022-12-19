/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pe.kawaii.ventas.services.UsuarioService;
import pe.kawaii.ventas.views.auth.VentanaAutenticacion;

/**
 *
 * @author Ivan
 */
public class LoginController {

    private static VentanaAutenticacion view = new VentanaAutenticacion();
    private static UsuarioService usuarioService = new UsuarioService();

    public static void mostrarVentana() {
        view.setVisible(true);
    }

    public static void login() {
        String username = view.getPnlLogin().getTxtUsuario().getText().trim();
        String password = String.valueOf(view.getPnlLogin().getTxtPassword().getPassword());

        if (usuarioService.login(username, password)) {

        } else {
            JOptionPane.showMessageDialog(view, "El usuario o contraseña no son correctos", "Ingreso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
