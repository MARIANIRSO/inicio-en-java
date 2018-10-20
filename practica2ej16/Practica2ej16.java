package practica2ej16;

import java.util.Scanner;

public class Practica2ej16 {
    public static void main(String[] args) {
        
        /*
        16 -  Escribir un programa en Java que lea un número
        entero desde teclado y realiza
        la suma de los 100 número siguientes,
        mostrando el resultado en pantalla.
/*
        
        */
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce un número");
            int numero = sc.nextInt();
            int suma = numero;
            for (int i = 1; i <= 101; i++) {
              
			suma = suma + numero + i;
            }
            
            System.out.println("La suma del número " +numero+ " más los 100 siguientes números es " + suma);
        }
        
        
        
    }
    
    
    
}
