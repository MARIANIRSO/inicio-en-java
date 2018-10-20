package practica2ej22;

import java.util.Scanner;

public class Practica2ej22 {

    public static void main(String[] args) {
        /*22 - Realiza el programa en JAVA tal que dado como dato el sueldo de un trabajador, 
                le aplique un aumento del 15% si su sueldo es inferior a $1000 y 12% en caso contrario.
                        Imprima el nuevo sueldo del trabajador
        Dato: SUE(variable de tipo real que representa el sueldo del trabajador)
    /*
        
         */
        double sueldo, nuevoSueldo;
        Scanner n = new Scanner(System.in);
        
        System.out.println("Ingrese sueldo actual: ");
        sueldo=n.nextDouble();
        if(sueldo<1000){
            nuevoSueldo= (double)(sueldo*1.15);
            System.out.println("Su nuevo sueldo con un aumento de 15% es: "+nuevoSueldo);
          }
        else {
            nuevoSueldo = (double)(sueldo*1.12);
            System.out.println("Su nuevo sueldo con una aumento del 12% es: "+ nuevoSueldo);
        }

    }
}
