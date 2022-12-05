package com.exercice.oo.exercice.levelOne.exerciceStudent.application;

import com.exercice.oo.exercice.levelOne.exerciceStudent.entity.Student;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Student student = new Student();

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o aluno e suas notas");
        System.out.print("Nome: ");
        student.name = input.nextLine();
        System.out.print("Nota 1: ");
        student.noteOne = input.nextDouble();
        System.out.print("Nota 2: ");
        student.noteTwo = input.nextDouble();
        System.out.print("Nota 3: ");
        student.noteThree = input.nextDouble();
        System.out.println();

        System.out.print(student);
    }
}
