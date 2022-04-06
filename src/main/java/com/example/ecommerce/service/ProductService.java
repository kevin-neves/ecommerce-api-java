package com.example.ecommerce.service;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.CustomerRepository;
import com.example.ecommerce.repository.ProdutcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProdutcRepository produtcRepository;
    private final CustomerRepository customerRepository;

    public Page<Product> listAll(Pageable pageable) {
        return produtcRepository.findAll(pageable);
    }

    public Product addProduct(Product product) {
        return produtcRepository.save(product);
    }

    public List<Customer> listCustomers() { return customerRepository.findAll(); }
}
