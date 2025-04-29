public class Pez extends Animal{

    public Pez(){}

    public Pez(String raza, int edad){
        super(raza, edad);
    }

    @Override
    public void respirar(){
        System.out.println("Respira el " + getRaza());
    }

    public void nadar(){
        System.out.println("Esta nadando " + getRaza());
    }
}
