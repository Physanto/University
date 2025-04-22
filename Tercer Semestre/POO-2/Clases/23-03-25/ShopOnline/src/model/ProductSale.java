/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author initmanfig
 */
public class ProductSale {
    
    private Product product;
    private int cantidad;
    
    public ProductSale(){}
    public ProductSale(Product product, int cantidad) {
        this.product = product;
        this.cantidad = cantidad;
    }

    public Product getProduct() {
        return product;
    }

    public int getCantidad() {
        return cantidad;
    }
}
