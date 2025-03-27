package controller;

import model.Product;
import java.util.ArrayList;

/**
 *
 * @author initmanfig
 */
public class ProductManager {
    private ArrayList<Product> listProducts;
    
    public ProductManager(){
        listProducts = new ArrayList<>();
    }
    
    public ProductManager(ArrayList<Product> listProducts){
        this.listProducts = listProducts;
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }

    @Override
    public String toString() {
        return "ProductManager{" + "listProducts=" + listProducts + '}';
    }
    
    

    public boolean addProduct(Product product){
        return listProducts.add(product);
    }

    public Product searchProduct(String id){
        
        for(Product product : listProducts){
            if(product.getid().equals(id)){
                return product;
            }
        }
        return null;
    }

    public boolean deleteProduct(String id){
        Product product = searchProduct(id);

        if(product != null){
            listProducts.remove(product);
            return true;
        }
        return false;
    }

    public boolean updateProduct(Product product, String id){

        for(int i = 0; i < listProducts.size(); i++){
            if(listProducts.get(i).getid().equals(id)){
                listProducts.set(i, product);
                return true;
            }
        }
        return false;
    }
}
