package com.example.wsclient.entity;

import com.example.wsclient.annocation.Column;
import com.example.wsclient.annocation.Table;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;

@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", type = "VARCHAR(250)")
    private String name;
    @Column(name = "price", type = "DOUBLE")
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//    private HashMap<String, String> error;
//
//
//    public boolean isValid() {
//        checkValid();
//        return error == null || error.size() == 0;
//
//    }
//
//    public void checkValid() {
//        this.error = new HashMap<>();
//        if (this.name == null || this.name.length() == 0) {
//            this.error.put("name", "Name is required!");
//        }
//        if (this.price <= 0) {
//            this.error.put("price", "Price is required!");
//        }
//    }
//
//    public HashMap<String, String> getErrors() {
//        checkValid();
//        return error;
//    }
}
