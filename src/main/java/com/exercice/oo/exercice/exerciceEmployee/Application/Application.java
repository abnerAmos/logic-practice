package com.exercice.oo.exercice.exerciceEmployee.Application;

import com.exercice.oo.exercice.exerciceEmployee.entity.Employee;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Employee employee = new Employee();

        Scanner input = new Scanner(System.in);
        System.out.println("Informe os dados do Funcionário");
        System.out.print("Nome: ");
        employee.name = input.nextLine();
        System.out.print("Salario Bruto: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = input.nextDouble();
        System.out.println();

        System.out.println("Funcionário: " + employee);
        System.out.println();

        System.out.print("Informe a porcentagem de aumento do Salário: ");
        employee.increaseSalary(input.nextDouble());
        System.out.println("Aumento: " + employee);
    }
}
