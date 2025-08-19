package com.andre.springcloud.msvc.items.models;

public class Item {

    private Product product;
    private int quantity;

    // Constructor
    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    // Getters and Setters
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return product.getPrice() * quantity;
    }
    
}
