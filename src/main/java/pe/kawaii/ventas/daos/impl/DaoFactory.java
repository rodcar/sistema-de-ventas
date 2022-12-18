/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.daos.impl;

import pe.kawaii.ventas.daos.IUsuarioDAO;

/**
 *
 * @author Ivan
 */
public class DaoFactory {

    public static IUsuarioDAO getUsuarioDAO(DataSource ds) {
        return switch (ds) {
            case MEMORY ->
                null;
            case MYSQL ->
                new pe.kawaii.ventas.daos.impl.mysql.UsuarioDAO();
            default ->
                null;
        };
    }
}
