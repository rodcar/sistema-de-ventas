/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.kawaii.ventas.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ivan
 */
public class DbConn {

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String usuario = "root";
    private static String password = "root";
    private static String database = "ventas";
    private static String url = "jdbc:mysql://localhost:3306/" + database + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    /**
     * Obtiene una conexi�n a la Base de Datos.
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            //Error en base de datos no se puede lograr la conexion
            System.out.println("Error:" + e);
        }
        return connection;
    }
}
