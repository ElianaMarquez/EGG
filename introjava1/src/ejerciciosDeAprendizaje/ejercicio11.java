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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applcation logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        
        
        do {
            System.out.println("**** MENU ****");
            System.out.println("  1. Sumar");
            System.out.println("  2. Restar");
            System.out.println("  3. Multiplicar");
            System.out.println("  4. Dividir");
            System.out.println("  5. Salir");
            System.out.println("** Elija opción **");
            opcion = leer.nextInt();
        
        
            switch (opcion) {
                case 1 :
                    int suma = num1+num2;
                    System.out.println("La suma de los números ingresados es: " + suma);
                break;
                case 2 :
                    int resta = num1-num2;
                    System.out.println("La resta de los números ingresados es: " + resta);
                break;
                case 3 :
                    int mult = num1*num2; 
                    System.out.println("La multiplicacion de los números ingresados es: " + mult);
                break;
                case 4 :
                    double div = num1/num2;
                    System.out.println("La división de los números ingresados es: " + div);
                break;
                case 5 : 
                    System.out.println("Está seguro que desea salir del programa (S/N)?");
                    String x = leer.next();
                    if (x.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo del programa");
                        break;
                    } else {
                        System.out.println("Vuelva a ingresar");
                    }
                default :
                System.out.println("Opción no válida");
                opcion = 0;
                break;
            }
        
    } while (opcion != 5);
         leer.close();
  }  
}
