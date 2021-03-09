package exercise4.services;

import exercise4.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){

        orderList.add(order);
    }

}
