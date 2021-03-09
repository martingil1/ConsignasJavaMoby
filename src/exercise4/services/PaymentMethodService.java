package exercise4.services;

import exercise4.models.Customer;
import exercise4.models.Order;
import exercise4.models.Product;

import java.util.List;

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
public class PaymentMethodService {

    public Double paymentCustomerFinal(Double amount) {

        return amount - (amount * 0.15);
    }

    public Double paymentCustomerBusiness(Double amount) {

        return amount - (amount * 0.10);
    }

    public Double calcularTotalBruto(Order order) {

        Double bruto = 0.0;
        for(Product product: order.getProducts()){
            bruto =bruto + product.getPrice();
        }
        return bruto;
    }

    public Boolean asignarPago(Customer customer, Double amount) {

        if (customer.getConsumerFinal()) {
            paymentCustomerFinal(amount);
            return true;
        } else {
            paymentCustomerBusiness(amount);
            return true;
        }
    }

    public Boolean cobrar(Order order, Customer customer, Double amount) {

        Boolean flag;
        if (!order.getPaid()) {
            if(asignarPago(customer, amount)) {
                order.setPaid(true);
                flag = true;
            }else{
                flag = false;
            }
        } else {
            flag= false;
        }
        return flag;
    }

}
