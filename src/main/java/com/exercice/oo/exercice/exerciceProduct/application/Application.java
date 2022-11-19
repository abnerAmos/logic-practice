package com.exercice.oo.exercice.exerciceProduct.application;

import com.exercice.oo.exercice.exerciceProduct.entity.Product;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        product.product = input.nextLine();
        System.out.print("Preço: ");
        product.price = input.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        product.quantity = input.nextInt();

        System.out.println("Produto em Estoque: " + product);
        System.out.println();

        System.out.print("Adicione a quantidade de " + product.product + " em Estoque: ");
        int quantity = input.nextInt();
        product.addStock(quantity);
        System.out.println("Total de produtos em estoque: " + product);
        System.out.println();

        System.out.print("Remova a quantidade de " + product.product + " em Estoque: ");
        quantity = input.nextInt();
        product.removeStock(quantity);
        System.out.println("Total de produtos em estoque: " + product);
    }
}
