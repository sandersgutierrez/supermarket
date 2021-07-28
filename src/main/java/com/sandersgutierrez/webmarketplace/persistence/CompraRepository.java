package com.sandersgutierrez.webmarketplace.persistence;

import com.sandersgutierrez.webmarketplace.domain.Purchase;
import com.sandersgutierrez.webmarketplace.domain.repository.PurchaseRepository;
import com.sandersgutierrez.webmarketplace.persistence.crud.CompraCrudRepository;
import com.sandersgutierrez.webmarketplace.persistence.entity.Compra;
import com.sandersgutierrez.webmarketplace.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(int clientId) {
        return compraCrudRepository.findByClienteId(clientId)
                .map(purchases -> mapper.toPurchases(purchases));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));

        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
