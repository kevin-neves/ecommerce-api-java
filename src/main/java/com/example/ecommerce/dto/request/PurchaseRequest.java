package com.example.ecommerce.dto.request;

import com.example.ecommerce.model.Customer;

import java.util.List;

public class PurchaseRequest {
    private String cpfCustomer;
    private Double total;
    private int customerId;
    private List<ProductRequest> productList;
}
