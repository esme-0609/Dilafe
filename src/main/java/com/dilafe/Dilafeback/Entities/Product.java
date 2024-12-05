package com.dilafe.Dilafeback.Entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_generator")
    @SequenceGenerator(name = "client_generator", sequenceName = "CLIENTE_SC", allocationSize = 1)
    @Column(name="id",nullable = false, unique = true)
    private Long idProduct;

    @Column(name="Name",nullable = false, unique = true)
    private String productName;

    @Column(name="Description",nullable = false, unique = true)
    private String description;

    @Column(name="Price",nullable = false, unique = true)
    private float price;

    @Column(name="Amount",nullable = false, unique = true)
    private int amount;

    @Column(name="Url",nullable = false, unique = true)
    private String imageUrl;

    @Column(name="Type",nullable = false, unique = true)
    private String type;

    @Column(name="Category",nullable = false, unique = true)
    private String category;

    @Column(name="Creation_date",nullable = false, unique = true)
    private Date date;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
