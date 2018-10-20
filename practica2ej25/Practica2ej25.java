package practica2ej25;

import java.util.Scanner;
import static javax.swing.text.html.HTML.Attribute.N;

public class Practica2ej25 {

    public static void main(String[] args) {

        /* 25 - Calcule el aumento de sueldo para un grupo de empleados 
                de una empresa teniendo en cuenta el siguiente criterio: 
                Si el sueldo es inferior a $1,000.00 : Aumento 15%
                 Si el sueldo es mayor o igual a $1,000.00 : Aumento 12%
                El programa debe hacer lo siguiente: 
                - Guardar los nuevos sueldos en el arreglo
                 - Calcular la nómina
                - Imprimir los sueldos desde el arreglo /*
        
         */
        double sueldo[] = new double[5];
        double nuevoSueldo[] = new double[5];
        double nomina []= new double [5];
        Scanner n = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese sueldo actual empleado nro "+(i+1)+":  ");

            sueldo[i] = n.nextDouble();
            
                
        }

        System.out.println("---");

        for (int i = 0; i < 3; i++) {

            if (sueldo[i] < 1000) {
                

                    nuevoSueldo[i] = (double) (sueldo[i] * 1.15);
                    System.out.println("-"+(i+1)+"-");
                    System.out.println("El sueldo del empleado nro "+(i+1)+" con un aumento de 15% es: " + nuevoSueldo[i]);
                }

            else {
               

                    nuevoSueldo[i] = (double) (sueldo[i] * 1.12);
                    System.out.println("-"+(i+1)+"-");
                    System.out.println("El sueldo del empleado nro "+(i+1)+" con un aumento de 12% es: " + nuevoSueldo[i]);
                    
                }
           
            nomina[i] = sueldo[i] + nuevoSueldo[i] ;
          // System.out.println("la nomina es: $  "+nomina[]);

                
            }  
            
        }

    }



