package practica2ej30;

import java.util.Scanner;

public class Practica2ej30 {

    public static void main(String[] args) {
        /* 30 - Escribir un programa que pida una contraseña numérica
               y permita tres intentos. Si el usuario ingresa la contraseña correcta,
               que se muestre "Correcto!" y que ejecute un programa cualquiera,
               después del mensaje. En caso contrario el programa debe mostrar
               "Contraseña equivocada". Posteriormente terminar el programa de inmediato.
/*
        
         */ int contraseña = 1243;
        int contadorIntentos = 0;

        while (contraseña != 1234) {
            contadorIntentos++;

            Scanner numero = new Scanner(System.in);
            //System.out.println("la contraseña es 1234");
            System.out.println("ingrese contraseña: ");
            contraseña = numero.nextInt();
                
            if (contadorIntentos == 3) {
                System.out.println("\n CONTRASEÑA EQUIVOCADA AL " + contadorIntentos+"er INTENTO\n USUARIO BLOQUEADO");
               System.exit(0); 
            } 
        }
           
        System.out.println("ACCESO CORRECTO");
        System.out.println("programa cualquiera");

    }

}
