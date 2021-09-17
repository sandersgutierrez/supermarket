package com.sandersgutierrez.supermarket.domain.repository;

import com.sandersgutierrez.supermarket.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();

    Optional<List<Purchase>> getByClient(int clientId);

    Purchase save(Purchase purchase);
}
