package com.miumg.project.model.personData;

import javax.persistence.*;

@Entity
@Table(name = "producto", schema = "dbo", catalog = "Universidad")
public class ProductoEntity {
    private int productId;
    private String product;
    private String amount;
    private String currency;

    public ProductoEntity(int productId, String product, String amount, String currency) {
        this.productId = productId;
        this.product = product;
        this.amount = amount;
        this.currency = currency;
    }

    public ProductoEntity() {
    }

    @Id
    @Column(name = "productId")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductoEntity that = (ProductoEntity) o;

        if (productId != that.productId) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
