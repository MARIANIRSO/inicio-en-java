package practica2ej27_28_29;

public class Practica2ej27_28_29 {

    public static void main(String[] args) {

        /*27 - Escribir un algoritmo que llame a otro, y el llamado imprima un valor.

          28 - Escribir un algoritmo que llame a otro de nombre 
               "sumar", que recibe 2 números. 
                El algoritmo sumar debe sumar sus parámetros. 
                El algoritmo que invoca debe recibir ese valor 
                y mostrarlo por pantalla.

          29 - Escribir un algoritmo y un subalgoritmo. 
               Escribir dos variables con el mismo nombre 
               y que el compilador no muestre error.
        
         */
        //  ej 29
        int numero1 = 1234;
        int numero2 = 5678;
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
                    // ej 28 
        int resultado = sumar(numero1, numero2);
        System.out.println("Resultado: " + resultado);

    }
        //ej28                               ej 29          ej 29
    private static int sumar(int numero1, int numero2) {
        return numero1 + numero2;

    }
}
