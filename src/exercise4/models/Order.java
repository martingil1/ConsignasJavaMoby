package exercise4.models;

import java.time.LocalDateTime;

public class Order {

    private Long idOrder;
    private Product product;
    private Customer customer;
    private LocalDateTime orderDate;
    private Boolean paid;

    public Order(Long idOrder, Product product, Customer customer, LocalDateTime orderDate, Boolean paid) {
        this.idOrder = idOrder;
        this.product = product;
        this.customer = customer;
        this.orderDate = orderDate;
        this.paid = paid;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Pedido:" +
                "\nnumero de orden: " + idOrder +
                "\nproducto: codigo:" + product.getCode() + " " + product.getName()+
                "\ncliente: codigo:"+ customer.getCode() + " " + customer.getName() + " " +customer.getSurname()  +
                "\ndia del pedido: " + orderDate +
                "\npagado: "+paid;
    }
}
