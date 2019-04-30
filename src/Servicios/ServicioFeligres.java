/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import modelo.Feligres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author estudiante
 */
public class ServicioFeligres {
    
    public static void guardar(Connection conexion, Feligres feligres) throws SQLException{
      try{
          
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO parroquia (cedula, nombre, direccion, telefono, estado, estrato) "
                 + "VALUES(?, ?, ?, ?, ?, ?)");        
         consulta.setString(1, feligres.getCedula());
         consulta.setString(2, feligres.getNombre());
         consulta.setString(3, feligres.getDireccion());
         consulta.setInt(4, feligres.getTelefono());
         consulta.setInt(5, feligres.getEstrato());
         consulta.setString(6, feligres.getEstado());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
    public static void actualizar(Connection conexion, Feligres feligres) throws SQLException{
      try{
          
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("UPDATE parroquia SET cedula=?, nombre=?, apellido=?, direccion=?, telefono=?, estrato=?, estado=? "
                 + "WHERE cedula=?");        
         consulta.setString(1, feligres.getCedula());
         consulta.setString(2, feligres.getNombre());
         consulta.setString(3, feligres.getDireccion());
         consulta.setInt(4, feligres.getTelefono());
         consulta.setInt(5, feligres.getEstrato());
         consulta.setString(6, feligres.getEstado());
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
    
    public static void eliminar(Connection conexion, String cedula) throws SQLException{
      try{
          
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("DELETE FROM parroquia "
                 + "WHERE cedula=?");        
         consulta.setString(1, cedula);
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
