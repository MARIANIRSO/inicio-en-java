package javaapplication8;

public class Computadora {
  
    private String marca; 
    private String procesador;
    private boolean tienePlacaVideo ;
    private boolean hdmi;
    private String sistemaOperativo;

    
    
    public Computadora() {
    }

    public Computadora(String marca, String procesador, boolean tienePlacaVideo, boolean hdmi, String sistemaOperativo) {
        this.marca = marca;
        this.procesador = procesador;
        this.tienePlacaVideo = tienePlacaVideo;
        this.hdmi = hdmi;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public boolean isTienePlacaVideo() {
        return tienePlacaVideo;
    }

    public void setTienePlacaVideo(boolean tienePlacaVideo) {
        this.tienePlacaVideo = tienePlacaVideo;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", tienePlacaVideo=" + tienePlacaVideo + ", hdmi=" + hdmi + ", sistemaOperativo=" + sistemaOperativo + '}';
    }
   
   
    
    
    
    
    
    
    
    
} // end class animales
