package Composicion;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        
        Parte procesador = new Parte(1, "procesador", "20Hz");
        Parte ram = new Parte(2, "ram", "8GB");
        Parte ssd = new Parte(3, "ssd", "1TB");

        ArrayList<Parte> partes = new ArrayList<>();
        partes.add(procesador);
        partes.add(ram);
        partes.add(ssd);

        Computador computador = new Computador("123", "Asus", "2014", 500.000, partes);

        computador.mostrarInfo();
    }
}
