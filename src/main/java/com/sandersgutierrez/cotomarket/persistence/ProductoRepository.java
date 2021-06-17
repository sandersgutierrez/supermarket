package com.sandersgutierrez.cotomarket.persistence;

import com.sandersgutierrez.cotomarket.persistence.crud.ProductoCrudRepository;
import com.sandersgutierrez.cotomarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategory(int categoriaId) {
        return productoCrudRepository.findByCategoriaIdOrderByNombreAsc(categoriaId);
    }

    public Optional<List<Producto>> getStock(int cantidad) {
        return productoCrudRepository.findByExistenciaIsLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProduct(int productoId) {
        return productoCrudRepository.findById(productoId);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(int productoId) {
        productoCrudRepository.deleteById(productoId);
    }
}
