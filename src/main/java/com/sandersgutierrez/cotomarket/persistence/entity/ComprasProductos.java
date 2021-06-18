package com.sandersgutierrez.cotomarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProductos {
    @EmbeddedId
    private ComprasProductosPK id;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "compra_id", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "producto_id", insertable = false, updatable = false)
    private Producto producto;

    public ComprasProductosPK getId() {
        return id;
    }

    public void setId(ComprasProductosPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
