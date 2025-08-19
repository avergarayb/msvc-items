package com.andre.springcloud.msvc.items.models;

import java.time.LocalDate;

public class Product {

    private long id;
    private String name;
    private double price;
    private LocalDate createAt;
    private int port;
    
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public LocalDate getCreateAt() {
        return createAt;
    }
    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }


}
