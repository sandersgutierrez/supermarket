package com.sandersgutierrez.webmarketplace.persistence.mapper;

import com.sandersgutierrez.webmarketplace.domain.Purchase;
import com.sandersgutierrez.webmarketplace.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @Mapping(source = "compraId", target = "purchaseId"),
            @Mapping(source = "clienteId", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "metodoPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "productos", target = "items")
    })
    Purchase toPurchase(Compra compra);

    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}
