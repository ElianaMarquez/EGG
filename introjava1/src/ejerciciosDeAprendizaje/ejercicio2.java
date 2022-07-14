/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDeAprendizaje;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
 
        System.out.println("Cúal es tu nombre?");
        String nombre = leer.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
