public class Animal{
    private String raza;
    private int edad;

    public Animal(){}

    public Animal(String raza, int edad){
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza(){ return raza; }
    public void setRaza(String raza){ this.raza = raza; }

    public int getEdad(){ return edad; }
    public void setEdad(int edad){ this.edad = edad; }

    public void respirar(){
        System.out.println("Respira " + raza);
    }
}
