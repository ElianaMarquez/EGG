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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Ingrese la nota de 0 a 10");
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("La nota no está comprendida entre 0 y 10, ingrese nuevamente");
            nota = leer.nextInt();
        }
            
    }
    
}
