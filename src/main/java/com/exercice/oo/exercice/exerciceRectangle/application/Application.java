package com.exercice.oo.exercice.exerciceRectangle.application;

import com.exercice.oo.exercice.exerciceRectangle.entity.Rectangle;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a altura e largura de um retangulo");
        System.out.print("Largura: ");
        rectangle.width = input.nextDouble();
        System.out.print("Altura: ");
        rectangle.height = input.nextDouble();
        System.out.println();

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimetro: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());
    }
}
