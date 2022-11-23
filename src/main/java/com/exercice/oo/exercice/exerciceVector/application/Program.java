package com.exercice.oo.exercice.exerciceVector.application;

import com.exercice.oo.exercice.exerciceVector.entity.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.println("Informe uma lista de produtos e preços, e calcule a soma\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de produtos a ser cadastrado:");
        int productQuantity = input.nextInt();
        Product[] product = new Product[productQuantity];

        double sum = 0;

        for (int i = 0; i < product.length; i++) {
            input.nextLine();
            System.out.print("Produto: ");
            String newProduct = input.nextLine();
            System.out.print("Preço: ");
            double price = input.nextDouble();
            product[i] = new Product(newProduct, price);

            sum += product[i].getPrice();
        }

        System.out.println("Preço total de produtos: " + sum);
    }
}
