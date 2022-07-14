
package servicios;

import entidades.Mascota;
import java.util.Scanner;


public class servicioMascota {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        
        System.out.println("Nombre de la mascota:");
        String nombre = leer.next();
        
        System.out.println("Ingrese el tipo:");
        String tipo = leer.next();
        
        System.out.println("Apodo de la mascota:");
        String apodo = leer.next();
        
        System.out.println("Edad de la mascota:");
        
        int edad = leer.nextInt();
        
       /* Mascota m = new Mascota(nombre, tipo, apodo, 0);
        
        return m;*/
       //tambien puede ser:
       
       return new Mascota(nombre, tipo, apodo, edad);
    }

  
    
    
}
