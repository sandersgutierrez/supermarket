package com.sandersgutierrez.webmarketplace.persistence.mapper;

import com.sandersgutierrez.webmarketplace.domain.PurchaseItem;
import com.sandersgutierrez.webmarketplace.persistence.entity.ComprasProductos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.productoId", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProductos producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.compraId", ignore = true),
    })
    ComprasProductos toComprasProductos(PurchaseItem item);
}
