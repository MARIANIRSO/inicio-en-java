package parctica2ej23;

public class Parctica2ej23 {

    public static void main(String[] args) {
        /*23 - Realice un programa que imprima las 10 tablas de multiplicar./*
        
         */

        int acumulador = 1;

        for (int n = 1; n < 11; n++) {
            acumulador = acumulador + n;
            System.out.println(" -------");
            for (int i = 1; i <= 10; i++) {

                System.out.println(n + " * " +i + " = " + n * i);
            }
        }
    }
}

