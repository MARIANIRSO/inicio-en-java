package javaapplication13;

public class JavaApplication13 {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("kevin", 1200.75);

        System.out.println(cuenta1);

        cuenta1.ingresar(-1400);
        System.out.println(cuenta1);
        cuenta1.ingresar(1350);
        System.out.println(cuenta1);
        System.out.println("*******");
        Cuenta cuenta2 = new Cuenta("kevin 8");
        System.out.println(cuenta2);

        cuenta2.setCantidad(2100);
        System.out.println("la cantida en la cuenta del 2 do cliente es de : " + cuenta2.getCantidad());

        cuenta2.ingresar(-1165);
        System.out.println(cuenta2);

        System.out.println("*******");
        Cuenta cuenta3 = new Cuenta("Sr mariano", 2600);
        cuenta3.setCantidad(7000);
        System.out.println(cuenta3);
        cuenta3.retirar(11000);
        System.out.println(cuenta3);
    }     // end main   
}// enda class
