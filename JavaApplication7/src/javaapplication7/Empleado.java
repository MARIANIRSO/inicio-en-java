package javaapplication7;

public class Empleado extends Persona{
    
    int legajo;

    public Empleado(int legajo, String nombre, String apellido, int edad, int peso, boolean tieneHijos) {
        super(nombre, apellido, edad, peso, tieneHijos);
        this.legajo = legajo;
    }

   
    
}
