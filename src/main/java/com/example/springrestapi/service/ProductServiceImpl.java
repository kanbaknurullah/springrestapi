package com.example.springrestapi.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.example.springrestapi.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    public ProductServiceImpl(){
        products.add(new Product(1l, "iphone", 1999));
        products.add(new Product(2l, "speaker", 599));
        products.add(new Product(3l, "book", 99));
    }

    List<Product> products = new ArrayList<Product>();

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(Long id){
        Iterator<Product> iterator =products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if (product.getProductID().equals(id)){
                return product;
            }
        }
        return null;
    }

    public void createProduct(Long productID, String productName, Integer price){
        products.add(new Product(productID, productName, price));
    }

    public void updateProduct(Product product){

        getProduct((Long) product.getProductID()).setProductPrice(product.getProductPrice());
        getProduct((Long) product.getProductID()).setProductName(product.getProductName());
    }

    public void deleteProduct(Long id){
        System.out.println("Status.. "+products.remove(getProduct(id)));
    }
}
