package com.codegym.model;

public class Customer {
    private Long id;

    private String name;
    private String email;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(Long id, String name, String email, String address, String img) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
