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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
        
        String fde = "&&&&&";
        int correct = 0;
        int incorrect = 0;
        String cadena;
        
        
        do {
            System.out.println("Ingrese cadenas de 5 caracteres y que comience con X y terminen con O");
            cadena = leer.next();
           String primerLetra = cadena.substring(0,1);
           String ultimaLetra = cadena.substring(4);
            
            if(primerLetra.equalsIgnoreCase("x") && ultimaLetra.equalsIgnoreCase("o"))  {
                System.out.println("Cadena CORRECTA");
                correct = correct + 1;
                }else   {
                System.out.println("Cadena INCORRECTA");
                incorrect = incorrect + 1;
                }
             
                    
                    
        } while (!cadena.equals(fde));
        incorrect = incorrect - 1;
      
        
        System.out.println("Lecturas CORRECTAS: " + correct);
        System.out.println("Lecturas INCORRECTAS: " + incorrect);

       
    } 
}
    

