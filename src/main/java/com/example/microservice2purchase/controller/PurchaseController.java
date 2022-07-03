package com.example.microservice2purchase.controller;

import com.example.microservice2purchase.model.Purchase;
import com.example.microservice2purchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping()
    public ResponseEntity<?>savePurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.savePurchase(purchase) , HttpStatus.CREATED);
    }

    @GetMapping("{UserId}")
    public ResponseEntity<?>getAllPurchasesOfUser(@PathVariable Long userId){
        return ResponseEntity.ok(purchaseService.findAllPurchaseOfUser((userId)));
    }
}
