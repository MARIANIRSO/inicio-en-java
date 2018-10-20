package practica2ej21;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practica2ej21 {

    public static void main(String[] args) {
        /* 21 - Realiza el programa en JAVA tal 
                que dado como datos la matrícula y 5 calificaciones de un alumno; 
                imprima la matrícula, el promedio y la palabra “aprobado” si el alumno tiene
                un promedio mayor o igual que 6, y la palabra “no aprobado” en caso contrario.
                Datos: MAT, CAL1, CAL2, CAL3, CAL4, CAL5 
                Donde: MAT es una variable entera que representa la matrícula del alumno. 
                CAL1, CAL2, CAL3, CAL4 y CAL5
                son variables de tipo real que representan las 5 calificaciones del alumno.
/*
        
         */
        int matricula;
        double nota, promedio = 0;

        Scanner n = new Scanner(System.in);
       
        System.out.println("Ingrese matricula del alumno:  ");
        matricula = n.nextInt();
        System.out.println("Matricula nro: " + matricula + " aceptada\n");
        System.out.println("Ingrese notas de los parciales para ver su Promedio");
        for (int i = 1; i < 6; i++) {
            System.out.println("Ingrese nota " + i + ": ");
            nota = n.nextDouble();
        
        promedio = promedio + nota;
        }
        promedio = promedio / 5;
        System.out.println("El promiedo es: "+promedio);
             JOptionPane.showMessageDialog(null,"El promedio es: "+ promedio);
        if(promedio<=6){
            System.out.println("NO APROBADO");
                 JOptionPane.showMessageDialog(null,"NO APROBADO");
        }else{
            System.out.println("APROBADO");
                 JOptionPane.showMessageDialog(null,"APROBADO");
        }       

    }
    
}
