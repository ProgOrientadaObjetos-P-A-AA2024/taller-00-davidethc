/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package paquete2;


/**
 *
 * @author reroes
 */
import paquete1.Mensaje;
import paquete3.Informacion;
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // usar printf;
        String mensaje = Mensaje.obtenerMensaje();
        System.out.printf(mensaje + " con "+ Informacion.obtenerHabitantes());
    }
    
}
