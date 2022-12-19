/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pe.kawaii.ventas;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pe.kawaii.ventas.controllers.LoginController;

/**
 *
 * @author EDITA
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        }
        LoginController.mostrarVentana();
    }
}
