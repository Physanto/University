package Exercise4;

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Pc Gamer", 3500000, (short)150);
        Clothes clothes = new Clothes("Vestido", 200000, "verano");

        System.out.println(device.toString());
        System.out.println("va tener un descuento de " + device.calculateDiscount() + " pesos");

        System.out.println(clothes.toString());
        System.out.println("va tener un descuento de " + clothes.calculateDiscount() + " pesos");
    }
}
