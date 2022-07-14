
package mascotaapp;

import entidades.Mascota;
import java.util.Scanner;
import servicios.servicioMascota;


public class Mascotaapp {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("Coco", "Perro", "Coqui", 5);
        
      /*  m1.nombre = "Coco";
        m1.apodo = leer.next();
        m1.raza = "Callejero";
        m1.tipo = "Perro";
        m1.color = "Negro";
        m1.edad = 4;
        m1.cola = true;*/
              
        System.out.println(m1.toString());
        
        m1.pasear(100);
        
        System.out.println(m1.toString());
        
        servicioMascota sm = new servicioMascota();
        
        Mascota m5 = sm.crearMascota();
        
        System.out.println(m5.toString());
     
        
    }
    
}
