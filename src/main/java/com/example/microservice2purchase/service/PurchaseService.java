package com.example.microservice2purchase.service;

import com.example.microservice2purchase.model.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchaseOfUser(Long userId);
}
