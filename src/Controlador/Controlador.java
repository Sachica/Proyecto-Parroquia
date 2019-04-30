/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Servicios.*;
import Vista.Formulario_Registro;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Feligres;

/**
 *
 * @author estudiante
 */
public class Controlador implements java.awt.event.ActionListener{
    private Formulario_Registro vista;
    private ArrayList<Integer> pagos;
    public Controlador(){
        vista = new Formulario_Registro();
        pagos = new ArrayList<>();
        vista.initListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnBuscar){
            try {            
                ServicioFeligres.buscar(Conexion.getConnection(), getFeligres().getCedula());
            } catch (SQLException ex) {
            }
        }
        
        if(e.getSource() == vista.btnEliminar){
            try {
                ServicioFeligres.eliminar(Conexion.getConnection(), getFeligres().getCedula());
            } catch (SQLException ex) {
            }
        }
        
        if(e.getSource() == vista.btnUpdate){
            try {            
                ServicioFeligres.actualizar(Conexion.getConnection(), getFeligres());
            } catch (SQLException ex) {
            }
        }        
        
        if(e.getSource() == vista.btnGuardar){
            try {
                ServicioFeligres.guardar(Conexion.getConnection(), getFeligres());
            } catch (SQLException ex) {
            }
        }
        
        if(e.getSource() == vista.btnPagar){
            Feligres f = getFeligres();
//            ServicioDiezmo.guardar(Conexion.getConnection(), f.getCedula(), DiezmoFactory.getDiezmo(f.getEstrato()));
            pagos.add(Integer.parseInt(vista.txtDiezmo.getText()));
        }
        
        if(e.getSource() == vista.btnConsult){
            try {              
                ServicioFeligres.buscar(Conexion.getConnection(), getFeligres().getCedula());
            } catch (SQLException ex) {
            }
        }
    }
    
    private Feligres getFeligres(){
        String cedula = vista.txtCedula.getText();
        String nombre = vista.txtNombre.getText();
        String direccion = vista.txtDir.getText();
        Integer telefono = Integer.parseInt(vista.txtTel.getText());
        Integer estrato = Integer.parseInt(vista.txtEstrato.getText());
        String estado = vista.txtEstado.getText();
//        return new Feligres(cedula, nombre, direccion, telefono, estrato, estado);
        return null;
    }
}
