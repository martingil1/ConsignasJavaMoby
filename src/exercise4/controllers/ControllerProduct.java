package exercise4.controllers;

import exercise4.models.Product;
import exercise4.services.ProductService;

import java.util.List;

public class ControllerProduct {

    private final ProductService productService = new ProductService();

    public void add (Product product){
        productService.addProduct(product);
    }

    public List<Product> showProducts(){
        return productService.showProducts();
    }

    public Boolean delete(String code){
        return productService.deleteProduct(code);
    }

    public Product info (String code){
        return productService.infoProduct(code);
    }
}
