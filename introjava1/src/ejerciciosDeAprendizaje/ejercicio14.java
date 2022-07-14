
package ejerciciosDeAprendizaje;
import java.util.Scanner;

public class ejercicio14 {

    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cantidad de Euros a convertir:");
        int euros = leer.nextInt();
        System.out.println("Seleccione el tipo de cambio: ");
        System.out.println(" A - Dólares");
        System.out.println(" B - Yenes");
        System.out.println(" C - Libras");
        String moneda = leer.next();
        
     
        
        convertirEuros(moneda, euros);
}
    public static void convertirEuros (String moneda, int euros){
     
        
        switch (moneda.toUpperCase()){
        case "A" :
            System.out.println("El cambio de " + euros + " euros equivale a "+ euros * 1.28611 + " Dólares");            
            break;
        case "B":
            System.out.println("El cambio de " + euros + " euros equivale a "+ euros*129.852 + " Yenes");
            break;
        case "C":
            System.out.println("El cambio de " + euros + " euros equivale a "+ euros*0.86 + " Libras");
            break;
        default :
            System.out.println("La opción seleccionada no es correcta");
    }
    }


}
