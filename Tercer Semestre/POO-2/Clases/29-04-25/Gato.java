public class Gato extends Animal{
    
    public Gato(){}

    public Gato(String raza, int edad){
        super(raza, edad);
    }

    @Override
    public void respirar(){
        System.out.println("");
    }

    public void maulla(){
        System.out.println("Nada el " + getRaza());
    }
}
