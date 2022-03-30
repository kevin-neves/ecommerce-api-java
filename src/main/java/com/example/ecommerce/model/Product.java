package com.example.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_code")
    private UUID productUuid;

    @Column(name = "product_description")
    private String description;

    @Column(name = "store_price")
    private Double price;

    @Column(name = "in_stock")
    private Boolean inStock;

    @Column(name = "product_size")
    private String size;

    @Column(name = "product_color")
    private String color;

    @Column(name = "product_brand")
    private String brand;

    @Column(name = "product_quantity")
    private Integer quantity;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "purchase_products",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "purchase_id") }
    )
    private List<Purchase> purchases;
}
