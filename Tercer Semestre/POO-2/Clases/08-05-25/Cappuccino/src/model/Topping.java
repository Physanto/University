package model;

public class Topping {
    private String name;
    private int cant;
    private double price;

    public Topping(String name, int cant, double price) {
        this.name = name;
        this.cant = cant;
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getcant() {
        return cant;
    }

    public void setcant(int cant) {
        this.cant = cant;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", cant=" + cant +
                ", price=" + price +
                '}';
    }
    public double calcular(){
        return cant * price;
    }
}
