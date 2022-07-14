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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese los grados centígrados:");
        double centig = leer.nextDouble();
        
        double fahr = (32 + (9*centig/5));
        
        System.out.println(centig + " Grados Cnetígrados equivalen a " + fahr + " Grados Fahrenheit");
    }
    
}
