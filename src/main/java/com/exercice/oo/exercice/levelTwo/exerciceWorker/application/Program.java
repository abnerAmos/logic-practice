package com.exercice.oo.exercice.levelTwo.exerciceWorker.application;

import com.exercice.oo.exercice.levelTwo.exerciceWorker.enums.WorkerLevel;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.Department;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.HoursContract;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Informe o nome do Departamento:");
        String department = input.nextLine();
        System.out.println("Informe os dados fucionário:");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Nivel: ");
        String level = input.nextLine();
        System.out.print("Salário Base: ");
        Double baseSalary = input.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.println("Informe quantos contratos serão adicionados:");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o " + (i+1) + "# Contrato:");
            System.out.print("Data do Contrato (dd/MM/yyyy): ");
            Date date = sdf.parse(input.next());
            System.out.print("Valor por Hora: ");
            Double valuePerHour = input.nextDouble();
            System.out.print("Duração (Horas): ");
            Integer hour = input.nextInt();
            HoursContract contract = new HoursContract(date, valuePerHour, hour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Informe o mes e ano para calculo (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Renda " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }
}
