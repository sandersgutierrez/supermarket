package com.sandersgutierrez.cotomarket.persistence.crud;

import com.sandersgutierrez.cotomarket.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByClienteId(int clienteId);
}
