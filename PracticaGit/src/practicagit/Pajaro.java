/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

/**
 *
 * @author lucas
 */
public class Pajaro {
    private String tipo; 
    private String alimentacion;
    private Boolean cautiverio; 
    private String lugar; 

    public Pajaro() {
    }

    
    public Pajaro(String tipo, String alimentacion, Boolean cautiverio, String lugar) {
        this.tipo = tipo;
        this.alimentacion = alimentacion;
        this.cautiverio = cautiverio;
        this.lugar = lugar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Boolean getCautiverio() {
        return cautiverio;
    }

    public void setCautiverio(Boolean cautiverio) {
        this.cautiverio = cautiverio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipo=" + tipo + ", alimentacion=" + alimentacion + ", cautiverio=" + cautiverio + ", lugar=" + lugar + '}';
    }
    
    
    
}
