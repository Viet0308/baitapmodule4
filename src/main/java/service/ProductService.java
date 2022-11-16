package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);
    }

    public void edit(int id, Product product){
        int index = findIndexByID(id);
        if (index != -1){
            products.set(index,product);
        }

    }

    public int findIndexByID(int id){
        for (int i=0; i<products.size();i++){
            if ( products.get(i).getId() == id ){
                return i;
            }
        }
        return -1;
    }

    public void delete(int id){
        int index = findIndexByID(id);
        if (index !=-1){
            products.remove(index);
        }
    }


}
