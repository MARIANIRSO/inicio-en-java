package javaapplication8;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {

        
        Computadora comp1 = new Computadora();
        comp1.setProcesador("intel");
        comp1.setMarca("noga");
        comp1.setSistemaOperativo("linux");
        comp1.setTienePlacaVideo(false);
        comp1.setHdmi(true);
        
        
        if (comp1.isTienePlacaVideo()) {
            System.out.println("tiene placa de video");
        }
        
                   
        System.out.println(comp1);
        
        System.out.println("-------");
        
        System.out.println(comp1.getProcesador());
        System.out.println(comp1.getMarca());
        System.out.println(comp1.getSistemaOperativo());
        System.out.println(comp1.isTienePlacaVideo());
        System.out.println(comp1.isHdmi());
        
        
        Computadora compu2 = new Computadora("KANJI", "INTEL", true, false, "Solaris");
        System.out.println("el nombre original del procesador es" + compu2.getProcesador());
        
        
        String proc = JOptionPane.showInputDialog("ingresar procesador");        
        compu2.setProcesador(proc);
        System.out.println("el nuevo nombre es" + compu2.getProcesador()); 
        JOptionPane.showMessageDialog(null, "procesador: " + compu2.getProcesador());
      
        
        
        List misCompus = new ArrayList();
        misCompus.add(new Computadora("qwerty", "asdf", true, true, "zxc"));
        misCompus.add(new Computadora("asdsdasadasd", "hh", true, true, "pppp"));
        misCompus.add(new Computadora("qwesdaasdsadrty", "gg", true, true, "lll"));
        misCompus.add(new Computadora("qwedgfghrty", "rrr", true, true, "zxoooc"));
        misCompus.add(new Computadora("jjjj", "eee", true, true, "zxjjjjc"));
        misCompus.add(new Computadora("yyyy", "asdqwer", true, true, "hhh"));
        
        
        
        for (Object mis : misCompus) {
            System.out.println(mis);
        }
    } // end class main
} // end class inicio
