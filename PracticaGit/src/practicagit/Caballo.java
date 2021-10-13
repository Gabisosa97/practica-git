package practicagit;

public class Caballo {
    private String nombre;
    private int edad;
    private String dueño;

    public Caballo(String nombre, int edad, String dueño) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
    }

    public Caballo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", edad=" + edad + ", due\u00f1o=" + dueño + '}';
    }
    
    
}
