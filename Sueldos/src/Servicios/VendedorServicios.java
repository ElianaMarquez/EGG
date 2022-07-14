
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicios {
    
    public Vendedor altaVendedor(){
        //instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        
        //lleno los atributos
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el Sueldo Básico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que empezo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año quje comenzó a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        v1.setFechaDeInicio(fecha); 
        
        return v1;
    }
    
    public void SueldoMensual (Vendedor v1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cúales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones( ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+ v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: "+ v1.getNombre()+ " es de $ " + v1.getSueldoMensual());
        
    }
    
    public void Vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaDeInicio().getYear();
        
        if (antiguedad < 5){
            System.out.println("Le corresponden 14 días de vacaciones");   
    } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 días de vacaciones");
            
    }else if (antiguedad < 20){
            System.out.println("Le corresponden 28 días de vaccaiones");
    }else if (antiguedad > 20){
            System.out.println("Le corresponden 35 dás de vacaciones");
            
    }else {
            System.out.println("El empleado tiene vacaciones proporcionales");
    }
}
