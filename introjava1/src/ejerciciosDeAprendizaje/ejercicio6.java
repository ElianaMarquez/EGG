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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        
        if (num1 % 2 != 0) {
            System.out.println("El número ingresado es IMPAR");
        } else {
            System.out.println("El número ingresado es PAR");
        }
    }
    
}
