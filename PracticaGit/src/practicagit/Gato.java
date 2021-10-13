package practicagit;

public class Gato {
    private String nombre;
    private int edad_meses;
    private String dueño;
    private String raza;

    public Gato() {
    }

    public Gato(String nombre, int edad_meses, String dueño, String raza) {
        this.nombre = nombre;
        this.edad_meses = edad_meses;
        this.dueño = dueño;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad_meses() {
        return edad_meses;
    }

    public void setEdad_meses(int edad_meses) {
        this.edad_meses = edad_meses;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad_meses=" + edad_meses + ", due\u00f1o=" + dueño + ", raza=" + raza + '}';
    }
    
    
}
