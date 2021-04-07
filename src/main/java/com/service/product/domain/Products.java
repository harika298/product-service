package com.service.product.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Products implements Serializable {

    @Id
    private int productId;

    private String category;
    private String productName;
    private double unitPrice;
    private String description;
    private int quantity;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ProductType.class)
    @JoinColumn(name = "product_type_id")
    @JsonBackReference
    private ProductType productType;

    public Products() {
    }

    public Products(int productId, String category, String productName, double unitPrice, String description, int quantity, ProductType productType) {
        this.productId = productId;
        this.category = category;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.description = description;
        this.quantity = quantity;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", category='" + category + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
