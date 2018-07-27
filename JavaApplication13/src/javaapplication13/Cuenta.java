package javaapplication13;

public class Cuenta {

    private String cliente;
    private double cantidad;

    public Cuenta(String cliente, double cantidad) {
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public Cuenta(String cliente) {
        this.cliente = cliente;
        this.cantidad = cantidad;

    }

    public Cuenta() {

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cliente=" + cliente + ", cantidad=" + cantidad + '}';
    }

    public void ingresar(double cantidad1) {

        if (cantidad1 < 0) {
            System.out.println("valor incorrecto");
            cantidad1 = 0 ;
       }
        cantidad = cantidad + cantidad1 ;
    }
    
    
    public void retirar(double cantidad1){
        
        if (cantidad<cantidad1){
           cantidad = 0;
            System.out.println("UD ESTA EN BANCA ROTA, ES MAS UD LE DEBE AL BANCO  !!!");
            
            
            
        }
        
    }

}
