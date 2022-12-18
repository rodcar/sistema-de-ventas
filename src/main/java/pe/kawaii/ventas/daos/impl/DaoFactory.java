package pe.kawaii.ventas.daos.impl;

import pe.kawaii.ventas.daos.IClienteDAO;
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
    
    public static IClienteDAO getClienteDAO(DataSource ds) {
        return switch (ds) {
            case MEMORY ->
                null;
            case MYSQL ->
                new pe.kawaii.ventas.daos.impl.mysql.ClienteDAO();
            default ->
                null;
        };
    }
    
}
