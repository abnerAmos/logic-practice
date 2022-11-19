package com.exercice.oo.exercice.exerciceEmployee.entity;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary () {
        return grossSalary - tax;
    }

    public void increaseSalary (double percentage) {
        grossSalary += (grossSalary * percentage) / 100;
    }

    public String toString () {
        return name + ", " +
                "salário líquido: " + netSalary();
    }
}
