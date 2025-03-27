package Exercise3;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(){}

    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                "bonus=" + bonus +
                '}';
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }
}
