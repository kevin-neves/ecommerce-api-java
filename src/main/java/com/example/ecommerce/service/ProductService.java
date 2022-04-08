package com.example.ecommerce.service;

import com.example.ecommerce.dto.request.ProductRequest;
import com.example.ecommerce.dto.response.CustomerResponse;
import com.example.ecommerce.dto.response.ProductResponse;
import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.CustomerRepository;
import com.example.ecommerce.repository.ProdutcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public ProductResponse addProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .productUuid(UUID.randomUUID())
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .inStock(productRequest.getInStock())
                .size(productRequest.getSize())
                .color(productRequest.getColor())
                .brand(productRequest.getBrand())
                .quantity(productRequest.getQuantity())
                .purchases(new ArrayList<>())
                .build();

        return new ProductResponse(produtcRepository.save(product));
    }

    public List<CustomerResponse> listCustomers() { return CustomerResponse.toResponseList(customerRepository.findAll()); }
}
