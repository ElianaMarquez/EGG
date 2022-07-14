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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            
            suma = suma + num;
        
    }while (suma < limite);
        leer.close();
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
