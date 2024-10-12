/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop6;

/**
 * Clase principal del proyecto POOP6.
 * En esta clase se ejecuta el método main que realiza acciones básicas 
 * como imprimir mensajes y crear instancias de la clase Coche.
 * @author erics
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hola mundo");

        // Creación de objetos de la clase Coche
        Coche coche = new Coche();
        Coche coche2 = new Coche("rojo", "ford", "MXN-435");
        
        // Impresión de las representaciones en cadena de los objetos Coche
        System.out.println(coche);
        System.out.println(coche2);
    }
}
    
   

