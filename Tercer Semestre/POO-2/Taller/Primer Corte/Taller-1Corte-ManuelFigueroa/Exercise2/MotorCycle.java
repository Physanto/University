package Exercise2;

public class MotorCycle extends Vehicle{
    private short cylinder;

    public MotorCycle(){}

    public MotorCycle(String plate, String mark, String model, short cylinder) {
        super(plate, mark, model);
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                super.toString() +
                "cylinder=" + cylinder +
                '}';
    }

    public short getCylinder() {
        return cylinder;
    }

    public void setCylinder(short cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String start(){
        return "El vehiculo " + getMark() + " con " + cylinder + " de cilindraje esta arrancando";
    }

    @Override
    public String stop(){
        return "El vehiculo " + getMark() + " con " + cylinder +  " de cilindraje esta parado";
    }
}
