package com.exercice.oo.exercice.levelOne.exerciceTriangle.program;

import com.exercice.oo.exercice.levelOne.exerciceTriangle.entity.Triangle;

import java.util.Scanner;

public class ProgramApplication {

    public static void main(String[] args) {

        // Exemplo simples de calculo utilizando OO
        Scanner input = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Informe os 3 lados do primeiro triangulo");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Informe os 3 lados do segundo triangulo");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        String result = areaX > areaY ? "Area X é maior" : "Area Y é maior";
        System.out.println(areaX);
        System.out.println(areaY);
        System.out.println(result);
    }
}
