package com.exercice.oo.exerciceTriangle.secondExercice.entity;

public class Product {

    public String product;
    public double price;
    public int quantity;

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
