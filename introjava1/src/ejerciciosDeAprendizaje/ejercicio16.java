
package ejerciciosDeAprendizaje;
import java.util.Scanner;

public class ejercicio16 {

    
    public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
   
        System.out.println("Tamaño del vector:");
        int tam = leer.nextInt();
        
        int[] vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector [i] = (int) (Math.random()* tam);
        }
    
        System.out.println("Qué número desea buscar en el vector?");
        int num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vector[i] == num) {
                cont = cont + 1;
                System.out.println("El número " + num + " se encuentra en la posición " + i);
            }
        }
        System.out.println("El número " + num + " se repite " + cont + " veces");
    }
    
}
