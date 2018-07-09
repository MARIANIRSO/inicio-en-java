package javaapplication7;

public class Auto { 
    
    
    private String marca;
    private String modelo;
    private int puertas;
    private boolean aireAcondicionado;
    private int velocidad;

    public Auto(String marca, String modelo, int puertas, boolean aireAcondicionado, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.aireAcondicionado = aireAcondicionado;
        this.velocidad= velocidad;
    }

    
   public String getMarca(){ 
       return marca; 
   }
    public void setMarca(String marca){
        this.marca= marca;       
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", puertas=" + puertas + ", aireAcondicionado=" + aireAcondicionado + ", velocidad=" + velocidad + '}';
    }
 
    
    /*
    public void acelerar(){
        
        acelerar(10);
    }
*/
    public void acelerar(int km) {
        velocidad=velocidad+km; 
        
        if(velocidad>100){
            System.out.println("no podes acelerar mas. Te bajo la velocidad");
            velocidad= 15;            
        }            
    }
    
    
    public void frenar(int km) {
        velocidad=velocidad-km; 
        
        if(velocidad<0){
            System.out.println("no podes frenar mas");
            velocidad= 0;            
        }            
    }
    
    
    
    
    
}
