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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase o palabra sólo de 8 caracteres");
        String frase = leer.nextLine();
        
        if (frase.length() != 8) {
            System.out.println("INCORRECTO");
        } else {
            System.out.println("CORRECTO");
        }
    }
    
}
