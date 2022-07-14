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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el número de elementos del cuadrado:"); 
        int elem = leer.nextInt();
        
        for (int i = 0; i < elem; i++) {
            for (int j = 0; j < elem; j++) {
                if (i == 0 || i == elem - 1 || j == 0 || j == elem-1){
                System.out.print("*");
                } else {
                    System.out.print(" ");
            }
               
        }
             System.out.println(" ");
    }
     
}
}


