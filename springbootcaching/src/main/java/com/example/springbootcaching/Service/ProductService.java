package com.example.springbootcaching.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import com.example.springbootcaching.Entity.Product;

@Service
public class ProductService {

    // simulated database
    Map<Long, Product> productInventory = new HashMap<>();

    public ProductService() {
        productInventory.put(1L, new Product(101L, "laptop", 50000));
        productInventory.put(2L, new Product(102L, "mobile", 80000));
    }

    // get product from inventory
    // Spring creates:
    // Cache:
    // products
    // Key:101 Value:
    // Product object
    // returned by the method @CachePut(value="products",key="#id")
    @Cacheable(key = "#id", value = "products")
    public Product getProductById(Long id) {
        simulatedTimeDelay();
        return productInventory.get(id);
    }

    // update product
    @CachePut(key = "#product.id", value = "products")
    public Product updateProduct(Product product) {
        return productInventory.put(product.getId(), product);
    }

    // delete product
    @CacheEvict(key = "#id", value = "products")
    public void deleteProduct(Long id) {
        productInventory.remove(id);
    }

    // adding time for operations
    void simulatedTimeDelay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
