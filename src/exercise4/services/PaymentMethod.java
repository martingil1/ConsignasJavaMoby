package exercise4.services;

import exercise4.models.Customer;
import exercise4.models.Order;

/*
Realizar los métodos
- calcularTotalBruto -> total de los productos (tener en cuenta precio unitario
y cantidad pedida)
- asignarPago -> se asigna un medio de pago según el cliente
- calcularTotalNeto -> calcular el total del pedido teniendo en cuenta los
descuentos
- cobrar -> pasa el pedido a un estado en el cual no se puede invocar al
método asignarPago
 */
public class PaymentMethod {

    public Double paymentCustomerFinal(Order order,Double amount) {

        order.setPaid(true);
        return amount - (amount * 0.15);
    }

    public Double paymentCustomerBusiness(Order order,Double amount) {

        order.setPaid(true);
        return amount - (amount * 0.10);
    }

    public void calcularTotalBruto() {

    }

    public Boolean asignarPago(Customer customer, Order order, Double amount) {

        if (customer.getConsumerFinal()) {
            paymentCustomerFinal(order,amount);
            return true;
        } else {
            paymentCustomerBusiness(order,amount);
            return true;
        }
    }

    public Boolean cobrar(Order order, Customer customer, Double amount) {

        if (!order.getPaid()) {
            return asignarPago(customer, order, amount);
        } else {
            return false;
        }
    }

}
