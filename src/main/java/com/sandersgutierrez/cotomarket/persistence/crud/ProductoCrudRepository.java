package com.sandersgutierrez.cotomarket.persistence.crud;

import com.sandersgutierrez.cotomarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByCategoriaIdOrderByNombreAsc(int categoriaId);

    Optional<List<Producto>> findByExistenciaIsLessThanAndEstado(int existencia, boolean estado);
}
