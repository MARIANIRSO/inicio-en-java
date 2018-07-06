package javaapplication7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class asd {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar algo");
        String valor = entrada.nextLine();
        System.out.println("------");
        
        System.out.println(valor);
        */
        int [] miArray = new int[4];
        miArray[0]= 91;
        miArray[1]= 11;
        miArray[2]= 22;
        miArray[3]= 9331;
        
        
        String nombre = "Brasil pecho frio";
        
        JOptionPane.showMessageDialog(null, nombre);
        JOptionPane.showConfirmDialog(null,"Estas seguro de la compra?");
        
             
        
        
        //bucle for
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }
        System.out.println("-------------------");
        
        for (int num : miArray) {
            System.out.println(num);
        }
        
        
    }
}
