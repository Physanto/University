import java.util.ArrayList;

public class ControlPersona {
    ArrayList<Persona> personas = new ArrayList<Persona>();
    Persona persona = new Persona();
    
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    
    public boolean eliminarPersona(int id){

        int posicion = buscarPersona(id);

        if(posicion != -1){
            personas.remove(posicion);
            return true;
        }
        return false;
    }
    
    public int buscarPersona(int id){

        for(int i = 0; i < personas.size(); i++){
            if(id == personas.get(i).getId()){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Persona> listarPersonas(){
        return personas;
    }
    
    public int contarPersonas(){
        return personas.size();
    }
    
    public boolean modificarPersona(int id, Persona persona){

        int pos = buscarPersona(id);

        if(pos != -1){
            personas.set(pos, persona);
            return true;
        }
        return false;
    }

    public Persona mayorPersonas(){

        Persona personaMayor = personas.get(0);

        for(int i = 0; i < personas.size(); i++){

            if(personaMayor.getEdad() < personas.get(i).getEdad()){
                personaMayor = personas.get(i);
            }
        }
        return personaMayor;
    }

    public Persona menorPersonas(Persona p){
        return p;
    }

    public Persona menorPersona(){
        Persona personaMenor = personas.get(0);

        for(int i = 0; i < personas.size(); i++){

            if(personaMenor.getEdad() > personas.get(i).getEdad()){
                personaMenor = personas.get(i);
            }
        }
        return personaMenor;
    }

    public float promedyEdades(){
        float promedy = 0;
        for(Persona persona : personas){
            promedy += persona.getEdad();
        }
        return promedy /= personas.size();
    }
    
}
