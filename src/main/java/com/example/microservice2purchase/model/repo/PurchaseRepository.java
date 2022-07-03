package com.example.microservice2purchase.model.repo;

import com.example.microservice2purchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/* Abstract class JpaRepository being extended */

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findAllByUserId(Long userId);
}
