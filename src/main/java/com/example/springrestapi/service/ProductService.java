package com.example.springrestapi.service;

import com.example.springrestapi.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
    void createProduct(Long productID, String productName, Integer price);
    void updateProduct(Product product);
    void deleteProduct(Long id);
}
