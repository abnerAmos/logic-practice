package com.exercice.oo.exercice.exerciceProduct.application;

import com.exercice.oo.exercice.exerciceProduct.entity.Product;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Preço: ");
        double price = input.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println("Produto em Estoque: " + product);
        System.out.println();

        System.out.print("Adicione a quantidade de " + product.product + " em Estoque: ");
        quantity = input.nextInt();
        product.addStock(quantity);
        System.out.println("Total de produtos em estoque: " + product);
        System.out.println();

        System.out.print("Remova a quantidade de " + product.product + " em Estoque: ");
        quantity = input.nextInt();
        product.removeStock(quantity);
        System.out.println("Total de produtos em estoque: " + product);
    }
}
