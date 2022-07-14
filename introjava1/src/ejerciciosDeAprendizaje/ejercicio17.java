
package ejerciciosDeAprendizaje;


public class ejercicio17 {

    public static void main(String[] args) {
       //declaro y asigno al vector un tamaño aleatorio
       int dim = (int) (Math.random() * 100);
       int [] vector = new int [dim];
        int largo;
       //asignar valores al vector al azar
       int cont0 = 0;
       int cont1 = 0;
       int cont2 = 0;
       int cont3 = 0;
       int cont4 = 0;
       int cont5 = 0;
  
        for (int i = 0; i < dim; i++) {
            vector[i] = (int) (Math.random() * 100000);
          } 
            
        for (int i = 0; i < dim; i++) {
            do {
                largo = vector[i]/10;
                cont0 = cont0 + 1;
            } while (vector[i] >= 10);
           
          switch (cont0 ){
                case 1 :
                    cont1 = cont1 + 1;
                case 2 :
                    cont2 = cont2 + 1;
                case 3 :
                    cont3 = cont3 + 1;
                case 4 : 
                    cont4 = cont4 + 1;
                case 5 :
                    cont5 = cont5 + 1;
            }   
        }
       
        for (int i = 0; i < dim; i++) {
            System.out.println("[" + vector[i] + "]");
            
        }
    
        
        System.out.println("La cantidad de elementos de 1 dígito es: " + cont1);
        System.out.println("La cantidad de elementos de 2 dígitos es: " + cont2);
        System.out.println("La cantidad de elementos de 3 dígitos es: " + cont3);
        System.out.println("La cantidad de elementos de 4 dígitos es: " + cont4);
        System.out.println("La cantidad de elementos de 5 dígitos es: " + cont5);
    }
    
}
