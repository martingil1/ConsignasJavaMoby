package exercise4.services;

import exercise4.exceptions.codeIncorrectException;
import exercise4.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {

        productNull(product);
        productList.add(product);

    }

    public List<Product> showProducts() {

        return productList;
    }

    public Boolean deleteProduct(String code) {

        Boolean flag = false;
        codeNull(code);
        for (Product product : productList) {
            if (code.equals(product.getCode())) {
                productList.remove(product);
                flag = true;
            }
        }
        return flag;
    }

    public Product infoProduct(String code) {

        Product product = null;
        codeNull(code);
        for (Product p : productList) {
            if (code.equals(p.getCode())) {
                product = p;
            }
        }
        if (product == null){
            throw new codeIncorrectException("no existe el codigo");
        }else {
            return product;
        }
    }

    public void productNull(Product p) {
        if (p == null) throw new NullPointerException();
    }

    public void codeNull(String c) {
        if (c == null) throw new NullPointerException();
    }

}
