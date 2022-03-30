package com.example.ecommerce.service;


import com.example.ecommerce.model.Purchase;
import com.example.ecommerce.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final PurchaseRepository purchaseRepository;

    public Page<Purchase> listPurchases(Pageable pageable) {
        return purchaseRepository.findAll(pageable);
    }

    public Purchase createPurchase(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

}
