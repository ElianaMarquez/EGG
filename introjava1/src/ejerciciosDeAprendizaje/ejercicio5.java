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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero");
        int num1 = leer.nextInt();
        
        System.out.println("El doble de " + num1 + " es " + num1*2);
        System.out.println("El triple de " + num1 + " es " + num1*3);
        System.out.println("La raiz cuadrada de " + num1 + " es " + Math.sqrt(num1));
    }
    
}
