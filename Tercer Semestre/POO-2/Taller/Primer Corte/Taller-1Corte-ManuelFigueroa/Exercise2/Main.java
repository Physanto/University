package Exercise2;

public class Main {

    public static void main(String[] args) {
        AutoMobile autoMobile = new AutoMobile("FDA12", "Toyota", "Land Cruise", (short)4);
        MotorCycle motorCycle = new MotorCycle("XYZ789", "Yamaha", "R3", (short)300);

        System.out.println(autoMobile.toString());
        System.out.println(autoMobile.start());
        System.out.println(autoMobile.stop());

        System.out.println(motorCycle.toString());
        System.out.println(motorCycle.start());
        System.out.println(motorCycle.stop());
    }
}
