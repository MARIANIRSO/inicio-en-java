package practica2ej20;

import java.util.Scanner;

public class Practica2ej20 {

    public static void main(String[] args) {
        
        /*20 - Escribe un programa java que declare una variable B de tipo entero 
               y asignarle un valor. 
               A continuación muestra un mensaje indicando 
               si el valor de B es positivo o negativo. 
               Consideraremos el 0 como positivo.
               Si por ejemplo B = 1 la salida será  1 es positivo. 
               Si fuese por ejemplo B = -1 la salida será: -1 es negativo.
        
/*
        
        */
        int b;
        Scanner n =new Scanner(System.in);
                System.out.println("Ingrese un numero entero: ");
                b= n.nextInt();
                if(b>=0){
                    System.out.println("El número: "+b+" es POSITIVO");
                }else
                {
                    System.out.println("El número: "+b+" es NEGATIVO");
                }     
   }
    
}
