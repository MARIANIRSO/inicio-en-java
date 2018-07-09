package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Persona persona1 = new Persona("Mariano", "cabrera", 29, 80, true);
        Persona persona2 = new Persona("Kevin", "Rios", 26, 115, false);
        System.out.println(persona1);
        
        System.out.println("ingresar nombre:");
        String test = entrada.nextLine();
        persona1.setNombre(test);
        System.out.println("ahora el nombre que mande por consola es " + persona1.getNombre());
        
        System.out.println(persona1);
        System.out.println("--------");
        System.out.println(persona2);
        
        System.out.println("--------");
        System.out.println(persona1.getNombre());
        
        persona1.setNombre("qwerty");
        
        System.out.println("El nuevo nombre es: " + persona1.getNombre());
        
        persona1.setTieneHijos(true);
        
        System.out.println(persona1.isTieneHijos());

        // el valor por defecto del if es true
        if (persona1.isTieneHijos()) {
            System.out.println("tenes hijos");
        } else {
            System.out.println("no");
        }

        // el equals es lo más optimo para String
        if (persona1.getApellido().equals("cabrera")) {
            System.out.println("bien");
        } else {
            System.out.println("mal");
        }
        
        System.out.println("--------------------------------------------------------------");
        
        Auto auto1 = new Auto("volkswagen", "gol trend", 2, true, 0);
        
        System.out.println(auto1);
        System.out.println("La marca es:" + auto1.getMarca());
        
        auto1.setMarca("Audi");
        System.out.println("la nueva marca es : " + auto1.getMarca());
        auto1.isAireAcondicionado();
        auto1.setAireAcondicionado(false);
        
        if (auto1.isAireAcondicionado()) {
            System.out.println("Tiene Aire acondicionado");
            
        } else {
            System.out.println("NO TIENE AIRE ACONDICIONADO");
        }
        
        System.out.println("-----------auto 2------------");
        
        Auto auto2 = new Auto("fiat", "palio", 2, true, 0);
        System.out.println("velocidad original: " + auto2.getVelocidad());
        
        auto2.acelerar(55);
        
        System.out.println("velocidad final: " + auto2.getVelocidad());
        
        auto2.frenar(60);
        
        System.out.println("velocidad final: " + auto2.getVelocidad());
        
    }
}
