package com.sandersgutierrez.cotomarket.persistence;

import com.sandersgutierrez.cotomarket.persistence.crud.ProductCrudRepository;
import com.sandersgutierrez.cotomarket.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int categoryId) {
        return productCrudRepository.findByCategoryIdOrderByNameAsc(categoryId);
    }

    public Optional<List<Product>> getStock(int quantity) {
        return productCrudRepository.findByStockQuantityIsLessThanAndState(quantity, true);
    }

    public Optional<Product> getProduct(int productId) {
        return productCrudRepository.findById(productId);
    }

    public Product save(Product product) {
        return productCrudRepository.save(product);
    }

    public void delete(int productId) {
        productCrudRepository.deleteById(productId);
    }
}
