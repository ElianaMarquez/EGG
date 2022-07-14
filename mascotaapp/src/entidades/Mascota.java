
package entidades;


public class Mascota {
    
    private String nombre;
    private String apodo;
    private String raza;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private int energia;

    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String tipo, String apodo, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") ||tipo.equals("Conejo") ||tipo.equals("Carpincho")){
          this.tipo = tipo;  
        }
        this.edad = edad;
        this.energia = 1000;
        
    }

    
    public Mascota(String nombre, String apodo, String raza, String tipo, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.energia = 1000;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }
 
    /**
     * funcion destinada a pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear (int energiaRestar){
        energia -= energiaRestar;
        
        return energia;
    }

    /**
     * funcion para pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia 
     */
    public int pasear (int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar; 
            
        }
        return energia;
    }
    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }
    
  
    
    
    
}
