package com.exercice.oo.exercice.levelTwo.exerciceWorker.application;

import com.exercice.oo.exercice.levelTwo.exerciceWorker.enums.WorkerLevel;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.Department;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.HoursContract;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.Worker;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.services.WorkerService;
import com.exercice.oo.exercice.levelTwo.exerciceWorker.services.WorkerServiceImpl;

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
        WorkerService workerService = new WorkerServiceImpl();

        System.out.println("Informe o nome do Departamento:");
        Department department = new Department(input.nextLine());

        System.out.println("Informe os dados fucionário:");
        System.out.print("Nome: ");
        String name = input.nextLine();
        System.out.print("Nivel: ");
        String level = input.nextLine();
        System.out.print("Salário Base: ");
        Double baseSalary = input.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary);

        System.out.println("Informe quantos contratos serão adicionados:");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o " + (i+1) + "# Contrato:");
            System.out.println("Data do Contrato (dd/MM/yyyy): ");
            input.next();
            Date date = sdf.parse(input.nextLine());
            System.out.println("Valor por Hora: ");
            Double valuePerHour = input.nextDouble();
            System.out.println("Duração (Horas): ");
            Integer hour = input.nextInt();
            HoursContract contract = new HoursContract(date, valuePerHour, hour);
            workerService.addContract(contract);
        }

        System.out.println(worker);
    }
}
