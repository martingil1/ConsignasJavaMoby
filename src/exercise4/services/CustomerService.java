package exercise4.services;

import exercise4.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer){

        customerNull(customer);
        customerList.add(customer);
    }

    public List<Customer> showCustomers(){

        return customerList;
    }

    public void customerNull(Customer customer){
        if (customer == null) throw new NullPointerException();
    }

}
