package exercise4.controllers;

import exercise4.models.Customer;
import exercise4.services.CustomerService;

import java.util.List;

public class ControllerCustomer {

    private final CustomerService customerService = new CustomerService();

    public void addCustomer (Customer customer){

        customerService.addCustomer(customer);
    }

    public List<Customer> showCustomers(){

        return customerService.showCustomers();
    }

}
