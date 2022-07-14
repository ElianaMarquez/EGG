/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava1;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // T int suma = num1 + num2;
   System.out.println("Hola mundo");
   
   Scanner leer = new Scanner(System.in);
        
   System.out.println("Con esta clase guardamos valores ingresados por consola en las variables");
   
   System.out.println("Ingresa tu nombre");
   String nombre = leer.nextLine();
   
    System.out.println("Ingresa tu edad");
    int edad = leer.nextInt();
    
    }
    }
    


