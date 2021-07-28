package com.sandersgutierrez.webmarketplace.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductosPK implements Serializable {
    @Column(name = "compra_id")
    private Integer compraId;

    @Column(name = "producto_id")
    private Integer productoId;

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }
}
