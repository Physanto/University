package Exercise3;

public class Main {

    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Juan", 1500000, 200000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Camilo", 0, (short)40, 5000);

        System.out.println(fullTimeEmployee.toString());
        System.out.println("calculando el salario, el total de cobro es " + fullTimeEmployee.calculateSalary());
        System.out.println(hourlyEmployee.toString());
        System.out.println("calculando el salario, el total de cobro es " + hourlyEmployee.calculateSalary());
    }
}
