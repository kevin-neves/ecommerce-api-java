package com.example.ecommerce.dto.response;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.model.Purchase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class CustomerResponse {
    private UUID customerUuid;
    private String name;
    private String address;
    private String cpf;
    private String email;
    private List<Purchase> purchases;

    public CustomerResponse(Customer customer){
        this.customerUuid = customer.getCustomerUuid();
        this.name = customer.getName();
        this.address = customer.getAddress();
        this.cpf = customer.getCpf();
        this.email = customer.getEmail();
        this.purchases = customer.getPurchases();
    }

    public static List<CustomerResponse> toResponseList(List<Customer> customers){
        return  customers.stream().map(CustomerResponse::new).collect(Collectors.toList());
    }
}
