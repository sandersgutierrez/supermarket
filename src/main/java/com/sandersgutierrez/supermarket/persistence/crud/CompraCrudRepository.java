package com.sandersgutierrez.supermarket.persistence.crud;

import com.sandersgutierrez.supermarket.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByClienteId(int clienteId);
}
