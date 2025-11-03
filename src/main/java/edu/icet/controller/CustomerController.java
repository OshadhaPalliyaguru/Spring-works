package edu.icet.controller;

import edu.icet.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/name")
    public String getname(){
        return "Saman";
    }

    @GetMapping("/age")
    public Integer getage(){
        return 11;
    }

    @GetMapping("/getcustomer")
    public Customer getCustomer(){
        return new Customer(
                "saman",
                "colombo",
                11
        );
    }
}
