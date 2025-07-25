package com.example.tripease.transformer;

import com.example.tripease.dto.request.CustomerRequest;
import com.example.tripease.dto.response.CustomerResponse;
import com.example.tripease.model.Customer;

public class CustomerTransformer {
    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
//        Customer customer=new Customer();
//        customer.setName(customerRequest.getName());
//        customer.setAge(customerRequest.getAge());
//        customer.setGender(customerRequest.getGender());
//        customer.setEmailId(customerRequest.getEmailId());
//        return  customer;

        Customer customer=Customer.builder()
                .name(customerRequest.getName())
                .age(customerRequest.getAge())
                .gender(customerRequest.getGender())
                .emailId(customerRequest.getEmailId())
                .build();
        return customer;

    }

    public static CustomerResponse customerToCustomerResponse(Customer customer){
//        CustomerResponse customerResponse=new CustomerResponse();
//        customerResponse.setName(customer.getName());
//        customerResponse.setAge(customer.getAge());
//        customerResponse.setEmailId(customer.getEmailId());
//        return customerResponse;

          return  CustomerResponse.builder()
                  .name(customer.getName())
                  .age(customer.getAge())
                  .emailId(customer.getEmailId())
                  .build();
    }

}
