package exercise4.controllers;

import exercise4.models.Customer;
import exercise4.models.Order;
import exercise4.services.PaymentMethodService;

public class ControllerPayment {

    private final PaymentMethodService paymentMethod = new PaymentMethodService();

    public Double totalBruto(Order order) {

        return paymentMethod.calcularTotalBruto(order);
    }

    public Double customerFinal(Double amount) {
        return paymentMethod.paymentCustomerFinal(amount);
    }

    public Double customerBusiness(Double amount) {
        return paymentMethod.paymentCustomerBusiness(amount);
    }

    public Boolean cobrarPedido(Order order, Customer customer, Double amount) {
        return paymentMethod.cobrar(order, customer, amount);
    }


}
