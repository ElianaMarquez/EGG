
package ejerciciosDeAprendizaje;


public class ejercicio15 {

   
    public static void main(String[] args) {
       int[] vector = new int[100];
       int num = 100;
       
        for (int i = 0; i < 100; i++) {
            vector[i] = num ;
            num = num - 1;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print("[" + vector[i]+ "]");
            
        }
    }
    
}
