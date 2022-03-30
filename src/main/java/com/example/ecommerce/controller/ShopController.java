package com.example.ecommerce.controller;

import com.example.ecommerce.model.Purchase;
import com.example.ecommerce.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @GetMapping("/")
    public Page<Purchase> getPurchaseList(Pageable pageable) {
        return shopService.listPurchases(pageable);
    }

    @PostMapping("/")
    public Purchase postPurchase(@RequestBody Purchase purchase) {
        return shopService.createPurchase(purchase);
    }

}


