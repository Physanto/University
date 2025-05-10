package model;

import java.util.ArrayList;

public class Cappuccino {

    private int code;
    private String name;
    private double price;
    private String presentation;
    private ArrayList<Water> waters;
    private ArrayList<Coffe> coffes;
    private ArrayList<Topping> toppings;

    public Cappuccino(int code, String name, double price, String presentation, ArrayList<Water> waters, ArrayList<Coffe> coffes) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.presentation = presentation;
        this.waters = waters;
        this.coffes = coffes;
        toppings = new ArrayList<>();
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public String getpresentation() {
        return presentation;
    }

    public void setpresentation(String presentation) {
        this.presentation = presentation;
    }

    public ArrayList<Water> getwater() {
        return waters;
    }

    public void setwater(ArrayList<Water> water) {
        this.waters = water;
    }

    public ArrayList<Coffe> getcoffe() {
        return coffes;
    }

    public void setcoffe(ArrayList<Coffe> coffe) {
        this.coffes = coffe;
    }

    public ArrayList<Topping> getTopping() {
        return toppings;
    }

    public void setTopping(ArrayList<Topping> topping) {
        this.toppings = topping;
    }

    public double calcularprice(){
        return price + getTotalwater() + getTotalcoffe() + getTotalToppings();
    }

    public double getTotalwater(){
        double price = 0;
        for(Water a : waters){
            price += a.calcular();
        }
        return price;
    }

    public double getTotalcoffe(){
        double price = 0;
        for(Coffe c : coffes){
            price += c.calcular();
        }
        return price;
    }

    public double getTotalToppings(){
        double price = 0;

        for(Topping t : toppings){
            price += t.calcular();
        }
        return price;
    }

    public void mostrarInfo(){
        System.out.println(" Este es el capuchino " + code + " " + name + " " + price + " " + presentation +
                " con estos componentes ");

        for(Water a : waters){
            System.out.println(a.toString());
        }

        for(Coffe c : coffes){
            System.out.println(c.toString());
        }
        for(Topping t : toppings){
            System.out.println(t.toString());
        }

        System.out.println(" su price total es de " + calcularprice());
    }

    public boolean agregarToppings(Topping topping){
        return toppings.add(topping);
    }
}
