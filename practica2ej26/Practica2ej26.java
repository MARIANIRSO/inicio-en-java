package practica2ej26;

import java.util.Scanner;

public class Practica2ej26 {

    public static void main(String[] args) {
        /* 26 - Realice un programa que pida el sueldo de N trabajadores
         (primero debe preguntar cuantos trabajadores van a haber)
        e imprima el que tiene mayor sueldo.

    
/*
        
         */

        int trabajadores;
        double sueldo[] = new double[100];
        double sueldoMinimo=1;
        double sueldoMaximo=1;
     
        Scanner n = new Scanner(System.in);
        System.out.println("¿Cuantos trabajadores hay actualmente?: ");
        trabajadores = n.nextInt();

        for (int i = 0; i < trabajadores; i++) {
            System.out.println("Ingrese sueldo actual empleado nro " + (i + 1) + ":  ");

            sueldo[i] = n.nextDouble();

        } 
        
        
       for (int i = 0; i < trabajadores; i++) {
            
               if (sueldo[i] >sueldoMaximo) {
            sueldoMaximo = sueldo[i];
             }
        else {
            sueldoMinimo=sueldo[i];
              }
        }System.out.println("El sueldo maximo es: "+sueldoMaximo);

         System.out.println("El sueldo minimo es: "+sueldoMinimo);
    }
}
