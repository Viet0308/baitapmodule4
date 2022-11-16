package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"Lộc","https://thethaovanhoa.mediacdn.vn/Upload/BLtvcXjb72tSqs1jiHr8g/files/2018/12/Jungkook13.jpg", 50000.0));
        products.add(new Product(2,"Khánh","https://img.meta.com.vn/Data/image/2022/02/17/anh-jungkook-1.jpg", 30000.0));
        products.add(new Product(3,"Mạnh","https://i.pinimg.com/originals/06/91/15/069115aea5fc95a5548b4562da55c680.jpg", 40000.0));
        products.add(new Product(4,"Vân","https://i.pinimg.com/originals/af/87/5c/af875cab80721bb5ee5e5143bc46a998.png", 20000.0));
    }

    public static void add(Product product){
        products.add(product);
    }

    public static void edit(int id, Product product){
        int index = findIndexByID(id);
        if (index != -1){
            products.set(index,product);
        }

    }

    public static int findIndexByID(int id){
        for (int i=0; i<products.size();i++){
            if ( products.get(i).getId() == id ){
                return i;
            }
        }
        return -1;
    }

    public static void delete(int id){
        int index = findIndexByID(id);
        if (index !=-1){
            products.remove(index);
        }
    }


}
