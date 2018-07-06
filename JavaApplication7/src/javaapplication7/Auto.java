package javaapplication7;

public class Auto { 
    
    
    private String marca;
    private String modelo;
    private int puertas;
    private boolean aireAcondicionado;

    public Auto(String marca, String modelo, int puertas, boolean aireAcondicionado) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.aireAcondicionado = aireAcondicionado;
    }

    
   public String getMarca(){ 
       return marca; 
   }
    public void setMarca(String marca){
        this.marca= marca;       
    }
    
    
    
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", puertas=" + puertas + ", aireAcondicionado=" + aireAcondicionado + '}';
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
 
    
    
    
    
    
    
    
}
