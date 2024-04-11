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
import java.util.Scanner;
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            
        // usar printf;
        // Estoy aprendiendo a utilizar paquetes y metodos los cuales nos ayudan a exportar ala clase main que es donde esta funcionando el programa 
        String mensaje = Mensaje.obtenerMensaje();
        String cadenaFinal = String.format("%s con %d ",mensaje,Informacion.obtenerHabitantes());
        

        // varaibles 
      
        System.out.println("Ingrese un numero entre 1 y 5 para presentar la cadena orignal caso contrario se mostrara en mayuscula ");
        int numero = sc.nextInt();
        
        if (numero >=1 && numero <=5 ){
            System.out.printf("%s/n", cadenaFinal);
            
        }else{
            System.out.printf("%s/n", cadenaFinal.toUpperCase());
        }
        
        
       
        
        
    }
    
}
