package com.example.ecommerce.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private Boolean inStock;
    private String size;
    private String color;
    private String brand;
    private Integer quantity;
}
