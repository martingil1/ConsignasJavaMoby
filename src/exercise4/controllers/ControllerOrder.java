package exercise4.controllers;

import exercise4.models.Order;
import exercise4.services.OrderService;

public class ControllerOrder {

    private final OrderService orderService = new OrderService();

    public void addOrder(Order order){
        orderService.addOrder(order);
    }

}
