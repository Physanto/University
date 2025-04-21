
import java.util.ArrayList;


public class GestionElectrodomesticos {
    
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public GestionElectrodomesticos() {
        listaElectrodomesticos = new ArrayList<>();
    }
    
    public boolean agregarElectrodomestico(Electrodomestico e){
        return listaElectrodomesticos.add(e);
    }
    
    public boolean eliminarElectrodomestico(int serialEliminar){
        Electrodomestico electrodomestico = buscarElectrodomestico(serialEliminar);
        
        if(electrodomestico != null){
            return listaElectrodomesticos.remove(electrodomestico);
        }
        return false;
    }
    
    public Electrodomestico buscarElectrodomestico(int serialBuscar){

        for(Electrodomestico electrodomestico : listaElectrodomesticos){
            if(electrodomestico.getSerial() == serialBuscar){
                return electrodomestico;
            }
        }
        return null;
    }     
}
