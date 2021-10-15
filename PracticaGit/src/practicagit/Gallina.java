
package practicagit;

/**
 *
 * @author Vanesa Fornés
 */
public class Gallina {
    //atributos
    String nombre;
    Integer tamano,peso;
    int cantHuevos;

    public Gallina() {
    }

    public Gallina(String nombre, Integer tamano, Integer peso, int cantHuevos) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.cantHuevos = cantHuevos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public int getCantHuevos() {
        return cantHuevos;
    }

    public void setCantHuevos(int cantHuevos) {
        this.cantHuevos = cantHuevos;
    }

    @Override
    public String toString() {
        return "Gallina{" + "nombre=" + nombre + ", tamano=" + tamano + ", peso=" + peso + ", cantHuevos=" + cantHuevos + '}';
    }
    
    
}
