package com.example.ecommerce.dto.response;

import com.example.ecommerce.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
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

    public ProductResponse(Product product){
        this.productUuid = product.getProductUuid();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.inStock = product.getInStock();
        this.size = product.getSize();
        this.color = product.getColor();
        this.brand = product.getBrand();
        this.quantity = product.getQuantity();
    }

    public static List<ProductResponse> toResponseList(List<Product> products){
        return  products.stream().map(ProductResponse::new).collect(Collectors.toList());
    }
}
