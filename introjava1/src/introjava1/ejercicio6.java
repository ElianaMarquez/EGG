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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*
        ejemplo de la guia:
        int num1 = 5;
        int num2 = 7;
        if (num1 < num2) {
            System.out.println("La variable num1 aloja un numero menor a la vaiable num2");     
        }else {
            System.out.println("La variable num1 aloja un numero mayor a la variable num2");
        }
*/
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese el valor de la variable num1");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el valor de la variable num2");
        int num2 = leer.nextInt();
        
        if (num2 > 25 && num1 > 25)  {
        System.out.println("Ambos numeros ingresados es mayor a 25");
        } else if (num1 > 25 || num2 > 25 ) {
         System.out.println("Uno de los valores igresados es mayor a 25");   
         }else  {
         System.out.println("ninguno de los numeros ingresados es mayor a 25");
   
        }

           
        }
             
    } 
    

