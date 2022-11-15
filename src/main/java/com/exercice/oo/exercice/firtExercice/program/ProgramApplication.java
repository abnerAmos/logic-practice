package com.exercice.oo.exercice.firtExercice.program;

import com.exercice.oo.exercice.firtExercice.entity.Triangle;

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

        double averageX = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(averageX * (averageX - x.a) * (averageX - x.b) * (averageX - x.c));

        double averageY = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(averageY * (averageY - y.a) * (averageY - y.b) * (averageY - y.c));

        String result = areaX > areaY ? "Area X é maior" : "Area Y é maior";
        System.out.println(areaX);
        System.out.println(areaY);
        System.out.println(result);
    }
}
