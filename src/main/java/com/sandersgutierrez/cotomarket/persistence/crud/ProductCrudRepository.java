package com.sandersgutierrez.cotomarket.persistence.crud;

import com.sandersgutierrez.cotomarket.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
    List<Product> findByCategoryIdOrderByNameAsc(int categoryId);
    Optional<List<Product>> findByStockQuantityIsLessThanAndState(int stockQuantity, boolean state);
}
