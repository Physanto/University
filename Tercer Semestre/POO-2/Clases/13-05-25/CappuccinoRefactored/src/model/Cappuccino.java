/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author initmanfig
 */
public class Cappuccino{

    private String code;
    private String name;
    private double price;
    private String presentation;
    private ArrayList<Water> waters;
    private ArrayList<Coffe> coffes;
    private ArrayList<Topping> toppings;
	private int rowCount = 0;
	private Object[][] data; 

    public Cappuccino(String code, String name, String presentation, double price, ArrayList<Water> waters, ArrayList<Coffe> coffes) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.presentation = presentation;
        this.waters = waters;
        this.coffes = coffes;
        toppings = new ArrayList<>();
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
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

	public double calculateTotal(){
		return price + calculatePrice(waters) + calculatePrice(coffes) + calculatePrice(toppings);
	}

	public double calculatePrice(ArrayList<? extends Calculate> data){
		double priceT = 0;
		for(Calculate c : data){
			priceT += c.calculatePrice();
		}
		return priceT;
	}

    public boolean addTopping(Topping topping){
        return toppings.add(topping);
    }

	public Object[][] dataComplete(){
		data = new Object[waters.size() + coffes.size() + toppings.size() + 1][5];
		dataWaters();
		dataCoffe();
		dataTopping();
		dataCappuccino();
		return data;
	}
	
	public void dataWaters(){	
		for (int i = 0; i < waters.size(); i++) {
			data[rowCount][0] = "Agua";	
			data[rowCount][1] = waters.get(i).gettype();
			data[rowCount][2] = waters.get(i).getcant();
			data[rowCount][3] = waters.get(i).getprice();
			data[rowCount][4] = waters.get(i).getcant() * waters.get(i).getprice();
			rowCount++;
		}
	}

	public void dataCoffe(){	
		for (int i = 0; i < coffes.size(); i++) {
			data[rowCount][0] = "Cafe";	
			data[rowCount][1] = coffes.get(i).gettype();
			data[rowCount][2] = coffes.get(i).getcant();
			data[rowCount][3] = coffes.get(i).getprice();
			data[rowCount][4] = coffes.get(i).getcant() * coffes.get(i).getprice();
			rowCount++;
		}
	}

	public void dataTopping(){	
		for (int i = 0; i < toppings.size(); i++) {
			data[rowCount][0] = "Topping";	
			data[rowCount][1] = toppings.get(i).getname();
			data[rowCount][2] = toppings.get(i).getcant();
			data[rowCount][3] = toppings.get(i).getprice();
			data[rowCount][4] = toppings.get(i).getcant() * toppings.get(i).getprice();
			rowCount++;
		}
	}

	public void dataCappuccino(){
		data[rowCount][0] = name; 
		data[rowCount][1] = presentation;
		data[rowCount][2] = "1";
		data[rowCount][3] = price;
		data[rowCount][4] = price;
	}
}
