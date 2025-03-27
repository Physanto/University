package Exercise2;

public abstract class Vehicle {
    private String plate;
    private String mark;
    private String model;

    public Vehicle() {}

    public Vehicle(String plate, String mark, String model) {
        this.plate = plate;
        this.mark = mark;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract String start();

    public abstract String stop();
}
