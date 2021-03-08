package exercise4.controllers;

import exercise4.models.Order;
import exercise4.services.OrderService;

import java.util.List;

public class ControllerOrder {

    OrderService orderService = new OrderService();

    public void addOrder(Order order){
        orderService.addOrder(order);
    }

    public List<Order> showOrders(){

        return orderService.showOrders();
    }

}
