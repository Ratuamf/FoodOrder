package com.example.ngeunah.Model;

import java.util.ArrayList;
import java.util.List;

public class Request {
    private String name;
    private String phone;
    private String address;
    private String price;
    private List<Cart> carts;

    public Request(String trim, String s, String trim1, String s1, String toString, ArrayList<Cart> list) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public Request(String name, String phone, String address, String price, List<Cart> carts) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.price = price;
        this.carts = carts;
    }

}
