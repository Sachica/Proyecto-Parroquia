/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/parroquia";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion realizada con exito");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            System.out.println("Conexion fallida");
        }
        return connection;
    }
}