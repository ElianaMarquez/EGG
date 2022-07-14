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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  for (int i = 0; i < 10; i++) {
            System.out.println("Imprimo el valor de i: " + i);    
        }
        System.out.println("============");
        
        System.out.println("for decreciendo");
        for (int i = 10; i > 0; i--) {
            System.out.println("Imprimo el valor de i: " + i);  
        }
      */  
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese 4 números entre 1 y 20: ");
        int x = 0;
        
        for (int i = 0; i < 4; i++) {
            x = leer.nextInt();
            if (x > 0 && x < 20){
                System.out.print(x);
                for (int j = 0; j < x; j++) {
                    System.out.print( "*");
                    
                }
                System.out.println(" ");
            } else {
                System.out.println("Ingrese un número entre 1 y 20");
            }
            
        }
        
        
      
      
    }
    
}
