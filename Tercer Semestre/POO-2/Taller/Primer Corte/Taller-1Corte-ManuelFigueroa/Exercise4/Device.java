package Exercise4;

public class Device extends Product{
    private short consumEnergy;

    public Device(){}

    public Device(String name, double price, short consumEnergy) {
        super(name, price);
        this.consumEnergy = consumEnergy;
    }

    @Override
    public String toString() {
        return "Device{" +
                super.toString() +
                "consumEnergy=" + consumEnergy +
                '}';
    }

    public short getConsumEnergy() {
        return consumEnergy;
    }

    public void setConsumEnergy(short consumEnergy) {
        this.consumEnergy = consumEnergy;
    }

    @Override
    public double calculateDiscount(){
        if(consumEnergy < 100){
            return getPrice() * 10 / 100;
        }
        else if(consumEnergy > 100 && consumEnergy < 200){
            return getPrice() * 40 / 100;
        }
        else{
            return 0;
        }
    }
}
