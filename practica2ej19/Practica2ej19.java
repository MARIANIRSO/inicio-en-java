package practica2ej19;
public class Practica2ej19 {

    public static void main(String[] args) {
        /*19 - Escribe un programa Java que realice lo siguiente: 
               declarar una variable N de tipo int, 
               una variable A de tipo double 
               y una variable C de tipo char 
               y asigna a cada una un valor.
               A continuación muestra por pantalla:
               El valor de cada variable. 
               La suma de N + A.
               La diferencia de A – N.
/*
        
        */
        int n = 15;
        double a = 5.25,suma=0.0, diferencia= 0.0;
        char c = 'A';
        
        System.out.println("El valor de N es: "+n);
        System.out.println("El valor de A es: "+a);
        System.out.println("El valor de C es: "+c);
        
        suma= n + a;
        diferencia= a-n;
        System.out.println("La suma de N + A es: "+suma);
        System.out.println("La diferncia de A-N es: "+diferencia);
    }
    
}
