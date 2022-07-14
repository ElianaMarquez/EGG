
package introjava1;
import java.util.Scanner;

public class ejercicio9 {

  
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
       /* String respuesta;
        
        do{
            System.out.println("desea continuar?");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
*/
       int num;
       int suma = 0;
       int cont =0;
       
       do { 
           System.out.println("Ingrese un número");
           num = leer.nextInt();
           if (num == 0){
                System.out.println("se capturó el número cero");
              break;  
             } else   
               suma = suma + num;
               cont = cont + 1;
             
          } while (cont < 20);
       
       System.out.println("La suma de los números ingresados es: " + suma);  
 
}

}
