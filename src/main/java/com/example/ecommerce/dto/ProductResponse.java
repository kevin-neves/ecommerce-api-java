package com.example.ecommerce.dto;

import com.example.ecommerce.model.Purchase;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

public class ProductResponse {
    private UUID productUuid;
    private String name;
    private String description;
    private Double price;
    private Boolean inStock;
    private String size;
    private String color;
    private String brand;
    private Integer quantity;
}
