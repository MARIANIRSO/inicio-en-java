package parctica2ej4_5_6_7;
public class Parctica2ej4_5_6_7 {
    public static void main(String[] args) {
     /* 4 Escribir un programa en Java que imprima 
            por pantalla la suma de 1234 y 532.
/*      5 - Escribir un programa en Java que imprima 
            por pantalla la resta de 1234 y 532.
        6 - Escribir un programa en Java que imprima por pantalla
            la multiplicación de 1234 y 532.
        7 - Escribir un programa en Java que imprima por pantalla
            la división de 1234 entre 532.
        
        */
        int numero1 = 1234;
        int numero2 = 532;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        suma = numero1 + numero2;
        resta= numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        
        System.out.println("La Suma  entre los numeros 1234 y 532 es: " + suma );
               
        System.out.println("La Resta entre los numeros 1234 y 532 es: " + resta );
        
        System.out.println("La Multiplicación entre los numeros 1234 y 532 es: " + multiplicacion );
          
        System.out.println("La División entre los numeros 1234 y 532 es:  " + division );


    }
    
}
