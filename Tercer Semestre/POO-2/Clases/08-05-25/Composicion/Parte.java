package Composicion;

public class Parte{
    private int codigo;    
    private String nombre;
    private String capacidad;

    public Parte(int codigo, String nombre, String capacidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String mostrarInfo(){
        return " " + codigo + " " + nombre + " " + capacidad;
    }
}
