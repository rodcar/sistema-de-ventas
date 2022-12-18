/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pe.kawaii.ventas;

import java.awt.geom.RoundRectangle2D;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pe.kawaii.ventas.views.auth.VentanaAutenticacion;

/**
 *
 * @author EDITA
 */
public class Main {

    public static void main(String[] args) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }
        // handle exception
        // handle exception
        // handle exception
        VentanaAutenticacion ventanaAutenticacion = new VentanaAutenticacion();
        ventanaAutenticacion.setVisible(true);
    }
}
