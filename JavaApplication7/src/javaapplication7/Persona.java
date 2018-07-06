package javaapplication7;

import java.util.logging.Logger;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int peso;
    private boolean tieneHijos;

    public Persona(String nombre, String apellido, int edad, int peso, boolean tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.tieneHijos = tieneHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }


    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peso=" + peso + ", tieneHijos=" + tieneHijos + '}';
    }
    
    
    
    
}
