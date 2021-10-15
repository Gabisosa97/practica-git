/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

/**
 *
 * @author USUARIO
 */
public class Chancho {
    private boolean sucio;
    private String genero;
    private String tamano;
    private boolean desciende;

    public Chancho() {
    }

    public Chancho(boolean sucio, String genero, String tamano, boolean desciende) {
        this.sucio = sucio;
        this.genero = genero;
        this.tamano = tamano;
        this.desciende = desciende;
    }

    public boolean isDesciende() {
        return desciende;
    }

    public void setDesciende(boolean desciende) {
        this.desciende = desciende;
    }

    public boolean isSucio() {
        return sucio;
    }

    public void setSucio(boolean sucio) {
        this.sucio = sucio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    
}
