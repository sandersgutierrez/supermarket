package com.sandersgutierrez.webmarketplace.domain.repository;

import com.sandersgutierrez.webmarketplace.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();

    Optional<List<Purchase>> getByClient(int clientId);

    Purchase save(Purchase purchase);
}
