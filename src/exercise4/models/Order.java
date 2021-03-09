package exercise4.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Long idOrder;
    private List<Product> products;
    private Customer customer;
    private LocalDateTime orderDate;
    private Boolean paid = false ;

    public Order(Long idOrder, List<Product> products, Customer customer, LocalDateTime orderDate) {
        this.idOrder = idOrder;
        this.products = products;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public List<Product> getProducts() {
        return products;
    }
}
