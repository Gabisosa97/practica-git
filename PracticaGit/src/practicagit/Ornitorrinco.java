package practicagit;


public class Ornitorrinco {
    private String nombre;
    private int edad;

    public Ornitorrinco() {
    }

    public Ornitorrinco(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Ornitorrinco{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
