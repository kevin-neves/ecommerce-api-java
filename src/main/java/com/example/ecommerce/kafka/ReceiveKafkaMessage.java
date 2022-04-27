package com.example.ecommerce.kafka;

import com.example.ecommerce.model.Purchase;
import com.example.ecommerce.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceiveKafkaMessage {

    private final ShopService shopService;

    @KafkaListener(topics = "PURCHASE_TOPIC", groupId = "group-1")
    public void listenTopic(Purchase purchase) {
        shopService.createPurchase(purchase);
    }
}
