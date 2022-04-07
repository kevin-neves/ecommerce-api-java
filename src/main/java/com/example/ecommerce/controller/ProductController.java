package com.example.ecommerce.controller;

import com.example.ecommerce.dto.request.ProductRequest;
import com.example.ecommerce.dto.response.ProductResponse;
import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/")
    public Page<Product> getProducts(Pageable pageable){
        return productService.listAll(pageable);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return productService.listCustomers();
    }

    @PostMapping("/")
    public ProductResponse postProduct(@RequestBody ProductRequest product) {
        return productService.addProduct(product);
    }
}

