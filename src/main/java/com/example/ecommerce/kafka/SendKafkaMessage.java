package com.example.ecommerce.kafka;

import com.example.ecommerce.model.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendKafkaMessage {

    private final KafkaTemplate<String, Purchase> kafkaTemplate;

    public void sendMessage(Purchase purchaseRequest) {
        kafkaTemplate.send("PURCHASE_TOPIC", purchaseRequest);
    }
}
