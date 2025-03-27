import java.util.ArrayList;

public class ControlPersonas{

    ArrayList<Persona> personas = new ArrayList<>();

    public void agregarPersonas(Persona p){
        personas.add(p);
    }

    public int buscarPersona(int id){

        for(int i = 0; i < personas.size(); i++) {
            
            if(id == (personas.get(i).getId())){
               return i;
            }
        }
        return -1;
    }

    public boolean eliminarPersona(int id){

        if(buscarPersona(id) != -1){
            personas.remove(id);
            return true;
        }
        return false;
    }

    public ArrayList<Persona> listarPersonas(){
        return personas;
    }

    public int contarPersonas(){
        return personas.size();
    }

    public boolean modificarPersona(int id, Persona p){
        int posicion = buscarPersona(id);

        if(posicion != -1){
            personas.set(posicion, p);
            return true;
        }
        return false;
    }
}
