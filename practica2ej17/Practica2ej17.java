package practica2ej17;

import java.util.Scanner;

public class Practica2ej17 {
    public static void main(String[] args) {
        /*17 - Escribir un programa en Java que convierta de pesos a dólares.
               Recibirá un número decimal correspondiente a la cantidad en pesos y 
               contestará con la cantidad correspondiente en dólares. 
               Tomar la cotización del dólar del día de hoy.
/*
        
        */

        
        double conversion = 0.0, valorDolar = 42.12,pesos;
        
        
        Scanner n=new Scanner(System.in);
        System.out.println("Ingrese monto en PESOS para su conversión:  ");
        pesos = n.nextDouble();
            
        conversion= pesos/valorDolar;
                
        System.out.println("Sobre el valor del DOLAR hoy en dia de: $ "+valorDolar+"\n sus :  $ "+pesos+" PESOS\n En DOLARES son: u$s "+conversion);
        
        
        
        
    }
    
}
