package practica2ej24;

import java.util.Scanner;

public class Practica2ej24 {

    public static void main(String[] args) {
        /*24 - Realice una calculadora./*
        
         */
        double numero1, numero2, suma = 0, resta = 0, multiplicacion = 1, division = 0;
        int opcion = 0;
        int numero3 = 1;

        Scanner numero = new Scanner(System.in);
 while (numero3 != 0) {
        System.out.print("Ingrese primer  número: ");
        numero1 = numero.nextDouble();
        System.out.print("Ingrese segundo número: ");
        numero2 = numero.nextDouble();
       
            System.out.println("elija una operacion matematica");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            opcion = numero.nextInt();
            while ((opcion < 1) || (opcion >= 5)) {
                System.out.println("opcion invalida ingrese otro numero: ");
                opcion = numero.nextInt();
            }

            switch (opcion) {

                case 1:
                    suma = numero1 + numero2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = numero1 - numero2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    multiplicacion = numero1 * numero2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                     while ((numero1 <= 1) && (numero2 < 1)) {
                        System.out.println("no se puede dividir,  ingrese primer número");
                        numero1 = numero.nextDouble();
                        System.out.println("no se puede dividir, ingrese segundo número");
                        numero2 = numero.nextDouble();
                              }
                    
                     
                    division = numero1 / numero2;
                    System.out.println("La division es: " + division);
                    break;
            }System.out.print("Desea realizar otra operacion? pulse ('1') 'si' o ( '0' ) 'no': ");
        numero3 = numero.nextInt();
        }
        

    }

}
