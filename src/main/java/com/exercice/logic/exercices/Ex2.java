package com.exercice.logic.exercices;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println("Informe uma Idade:");
        Scanner ageIn = new Scanner(System.in);
        Integer age = ageIn.nextInt();

        System.out.println("Informe um Salario:");
        Scanner salaryIn = new Scanner(System.in);
        Double salary = salaryIn.nextDouble();

        System.out.println("Informe um Sexo:");
        Scanner genderIn = new Scanner(System.in);
        String gender = genderIn.next();

        String returnAge = (age > 150) ? "Não esta mais vivo" : age.toString();
        System.out.println(returnAge);

        String retornSalary = (salary > 0) ? "Sem dinheiro em caixa" : salary.toString();
        System.out.println(retornSalary);

        if(!(gender.equals("M") || gender.equals("F") || gender.equals("Outro")))
            System.out.println("Genero Inválido");
        else System.out.println(gender);

        // Retorna uma mensagem para cada condição
    }
}
