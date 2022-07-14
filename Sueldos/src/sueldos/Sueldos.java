
package sueldos;

import Entidades.Vendedor;
import Servicios.VendedorServicios;


public class Sueldos {

   
    public static void main(String[] args) {
    VendedorServicios vs = new VendedorServicios();
    Vendedor v1 = vs.altaVendedor();
    vs.SueldoMensual(v1);
    vs.Vacaciones(v1);
    
    }
    
}
