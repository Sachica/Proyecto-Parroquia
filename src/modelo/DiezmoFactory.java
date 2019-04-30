/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class DiezmoFactory {
    public static Integer getDiezmo(Integer estrato){
        switch(estrato){
            case 1 : return 250000;
            case 2 :case 3 : return 500000;
            default : return 1000000;
        }
    }
}
