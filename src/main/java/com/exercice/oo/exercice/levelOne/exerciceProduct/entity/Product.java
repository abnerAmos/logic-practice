package com.exercice.oo.exercice.levelOne.exerciceProduct.entity;

public class Product {

    String product;
    private double price;
    private int quantity;

    public Product(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock () {
        return price * quantity;
    }

    public void addStock (int quantity) {
        this.quantity += quantity;
    }

    public void removeStock (int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return product +
                ", price $" + price +
                ", quantity " + quantity +
                ", total " + totalValueInStock();
    }
}
