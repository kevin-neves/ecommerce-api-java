package com.example.ecommerce.controller;

import com.example.ecommerce.kafka.SendKafkaMessage;
import com.example.ecommerce.model.Purchase;
import com.example.ecommerce.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;
    private SendKafkaMessage sendKafkaMessage;

    @GetMapping("/")
    public Page<Purchase> getPurchaseList(Pageable pageable) {
        return shopService.listPurchases(pageable);
    }

    @PostMapping("/")
    public void postPurchase(@RequestBody Purchase purchase) {
        sendKafkaMessage.sendMessage(purchase);
        /*return shopService.createPurchase(purchase);*/
    }

}


