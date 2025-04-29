public class Perro extends Animal{
    
    public Perro(){}

    public Perro(String raza, int edad){
        super(raza, edad);
    }

    @Override
    public void respirar(){
        System.out.println("Respira el " + getRaza());
    }

    public void ladrar(){
        System.out.println("ladra el " + getRaza());
    }
}
