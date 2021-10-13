package practicagit;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Carpincho {
    String raza;
    Integer tamano,edad;
    Boolean amigable,tomaMate;
    
    ArrayList<Carpincho> carpinchosSucesores = new ArrayList();

    public Carpincho() {
    }

    public Carpincho(String raza, Integer tamano, Integer edad, Boolean amigable, Boolean tomaMate) {
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
        this.amigable = amigable;
        this.tomaMate = tomaMate;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getAmigable() {
        return amigable;
    }

    public void setAmigable(Boolean amigable) {
        this.amigable = amigable;
    }

    public Boolean getTomaMate() {
        return tomaMate;
    }

    public void setTomaMate(Boolean tomaMate) {
        this.tomaMate = tomaMate;
    }

    public ArrayList<Carpincho> getCarpinchosSucesores() {
        return carpinchosSucesores;
    }

    public void setCarpinchosSucesores(ArrayList<Carpincho> carpinchosSucesores) {
        this.carpinchosSucesores = carpinchosSucesores;
    }

    @Override
    public String toString() {
        return "Carpincho{" + "raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + ", amigable=" + amigable + ", tomaMate=" + tomaMate + ", carpinchosSucesores=" + carpinchosSucesores + '}';
    }
    
    
    
}
