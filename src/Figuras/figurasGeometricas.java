package Figuras;

public class figurasGeometricas {
    int nlados;
    String nombre;

    public figurasGeometricas() {
    }

    public figurasGeometricas(int nlados, String nombre) {
        this.nlados = nlados;
        this.nombre = nombre;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
