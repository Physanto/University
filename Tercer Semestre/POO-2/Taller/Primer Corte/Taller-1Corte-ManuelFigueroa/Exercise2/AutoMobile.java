package Exercise2;

public class AutoMobile extends Vehicle{
    private short numberGates;
    public AutoMobile(){}

    public AutoMobile(String plate, String mark, String model, short numberGates) {
        super(plate, mark, model);
        this.numberGates = numberGates;
    }

    @Override
    public String toString() {
        return "AutoMobile{" +
                super.toString() +
                "numberGates=" + numberGates +
                '}';
    }

    public short getNumberGates() {
        return numberGates;
    }

    public void setNumberGates(short numberGates) {
        this.numberGates = numberGates;
    }

    @Override
    public String start(){
        return "El vehiculo " + getMark() + " con " + numberGates + " puertas esta arrancando";
    }

    @Override
    public String stop(){
        return "El vehiculo " + getMark() + " con " + numberGates +  " puertas esta parado";
    }

}
