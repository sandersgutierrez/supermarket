package com.sandersgutierrez.cotomarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "purchases_products")
public class PurchaseProduct {
    @EmbeddedId
    private PurchaseProductPK id;

    private Integer quantity;

    private Double amount;

    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "purchase_id", insertable = false, updatable = false)
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    public PurchaseProductPK getId() {
        return id;
    }

    public void setId(PurchaseProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
