
package controller;

import java.util.ArrayList;
import model.Category;
import model.Product;

/**
 *
 * @author initmanfig
 */
public class CategoryManager {
    ArrayList<Category> listCategorys;

    public CategoryManager() {
        listCategorys = new ArrayList<>();
    }

    public CategoryManager(ArrayList<Category> listCategorys) {
        this.listCategorys = listCategorys;
    }

    public ArrayList<Category> getListCategorys() {
        return listCategorys;
    }

    public void setListCategorys(ArrayList<Category> listCategorys) {
        this.listCategorys = listCategorys;
    }

    public boolean addCategory(Category category){
        return listCategorys.add(category);
    }
    
    public Category searchCategory(String id){
        for(Category category : listCategorys){
            if(category.getId().equals(id)){
                return category;
            }
        }
        return null;
    }
    
    public boolean deleteCategory(String id){
        Category category = searchCategory(id);

        if(category != null){
            return listCategorys.remove(category);
        }
        return false;
    }

    public boolean updateCategory(Category category, String id){

        for(int i = 0; i < listCategorys.size(); i++){
            if(listCategorys.get(i).getId().equals(id)){
                listCategorys.set(i, category);
                return true;
            }
        }
        return false;
    }
    
    public Object[][] list(){
        Object[][] categorys = new Object[listCategorys.size()][5];
        int i = 0;
        for(Category category : listCategorys){
            
            categorys[i][0] = category.getId();
            categorys[i][1] = category.getName();
            categorys[i][2] = category.getDescription();
            i++;
        }
        return categorys;
    }
}
