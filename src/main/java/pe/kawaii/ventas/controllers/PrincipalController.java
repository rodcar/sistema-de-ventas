/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import javax.swing.JFrame;
import pe.kawaii.ventas.session.UserSession;
import pe.kawaii.ventas.views.VentanaPrincipal;

/**
 *
 * @author Ivan
 */
public class PrincipalController {

    private static VentanaPrincipal view = new VentanaPrincipal();

    public static void mostrarVentana() {       
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
    }

}
