package Composicion;
import java.util.ArrayList;

public class Computador{
    private String serie;
    private String marca;
    private String modelo;
    private double precio;
    private ArrayList<Parte> partes;

    public Computador(String serie, String marca, String modelo,
            double precio, ArrayList<Parte> partes){
        
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.partes = partes;
    }

    public ArrayList<Parte> getParte(){
        return partes;
    }

    public void mostrarInfo(){ 
        System.out.println(" " + serie + " " + marca + " " + modelo + " "+
                precio + " tiene estas partes ");

        for(Parte parte : getParte()){
            System.out.print(parte.mostrarInfo());
        }
    }
}
