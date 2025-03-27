package Exercise3;

public class HourlyEmployee extends Employee{
    private short hoursWorked;
    private double valueHour;

    public HourlyEmployee(){}

    public HourlyEmployee(String name, double baseSalary, short hoursWorked, double valueHour) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.valueHour = valueHour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                "hoursWorked=" + hoursWorked +
                ", valueHour=" + valueHour +
                '}';
    }

    public short getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(short hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getValueHour() {
        return valueHour;
    }

    public void setValueHour(double valueHour) {
        this.valueHour = valueHour;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * valueHour;
    }
}
