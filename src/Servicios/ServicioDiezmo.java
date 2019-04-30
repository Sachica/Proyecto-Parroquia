/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Feligres;

/**
 *
 * @author estudiante
 */
public class ServicioDiezmo {
    
    public static void guardar(Connection conexion, String cedula, Integer diezmo) throws SQLException{
      try{
          
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO diezmo (cedula, nombre) "
                 + "VALUES(?, ?)");        
         consulta.setString(1, cedula);
         consulta.setInt(2, diezmo);
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
    public static void buscar(Connection conexion, String cedula) throws SQLException{
      try{
          
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("SELECT * FROM parroquia "
                 + "WHERE cedula=?");        
         consulta.setString(1, cedula);
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }    
}
