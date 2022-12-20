/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.controllers;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import pe.kawaii.ventas.models.Rol;
import pe.kawaii.ventas.session.UserSession;
import pe.kawaii.ventas.views.VentanaPrincipalAdministrador;
import pe.kawaii.ventas.views.VentanaPrincipalVendedor;
import pe.kawaii.ventas.views.usuario.PanelMantenimientoUsuario;

/**
 *
 * @author Ivan
 */
public class PrincipalController {

    private static VentanaPrincipalAdministrador viewAdministrador = new VentanaPrincipalAdministrador();
    private static VentanaPrincipalVendedor viewVendedor = new VentanaPrincipalVendedor();

    public static void mostrarVentana() {
        Rol rol = UserSession.getInstance().getRol();
        if (rol == Rol.ADMINISTRADOR) {
            viewAdministrador.setExtendedState(JFrame.MAXIMIZED_BOTH);
            viewAdministrador.setVisible(true);
        } else if (rol == Rol.VENDEDOR) {
            viewVendedor.setExtendedState(JFrame.MAXIMIZED_BOTH);
            viewVendedor.setVisible(true);
        }
    }

    public static void mostrarMantenimientoUsuario() {
        PanelMantenimientoUsuario pnlUsuario = new PanelMantenimientoUsuario();

        viewAdministrador.getPnlGeneral().removeAll();
        viewAdministrador.getPnlGeneral().add(pnlUsuario);
        SwingUtilities.updateComponentTreeUI(viewAdministrador.getPnlGeneral());
    }

}
