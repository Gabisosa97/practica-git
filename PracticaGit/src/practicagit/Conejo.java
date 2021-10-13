
package practicagit;

public class Conejo {

    private String nombre;
    private int edad;

    public Conejo(String nombre, int edad, String dueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDueño() {
        return dueño;
    }
    private String dueño;
}


