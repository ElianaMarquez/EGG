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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        
        String clave = "eureka";
        
        if (frase.equalsIgnoreCase(clave)) {
            System.out.println("CORRECTO");
        }   else {
            System.out.println("INCORRECTO");
        }
    }
    
}
