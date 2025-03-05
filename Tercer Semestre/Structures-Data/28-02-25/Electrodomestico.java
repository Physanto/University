public class Electrodomestico{

    private String serie;
    private String nombre;
    private float precio;

    public Electrodomestico(String serie, String nombre, float precio){
        this.serie = serie;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString(){
        return serie + "\t" + nombre + "\t" + precio;
    }

    public String getNombre(){ return nombre; }
    //Getters and Setters
}
