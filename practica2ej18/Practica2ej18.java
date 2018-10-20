package practica2ej18;

import java.util.Scanner;

public class Practica2ej18 {

    public static void main(String[] args) {
        
        /*18 - Escribir un programa en Java que lea dos números del teclado
                y diga cual es el mayor y cual el menor.
/*
        
        */

        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = n.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = n.nextInt();
        
        System.out.println("♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠♠");

        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");

        } else {
            if (numero1 > numero2) {
                System.out.println(numero1 + " Es mayor que " + numero2);
            } else {
                System.out.println(numero1 + " Es menor que " + numero2);
            }

        }
    }
}


