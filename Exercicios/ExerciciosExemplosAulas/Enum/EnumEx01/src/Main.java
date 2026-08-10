import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter department's name: ");
        String departmentName = sc.next();

        Department department = new Department(departmentName);

        System.out.print("Enter worker data: \n");

        System.out.print("Name: ");
        String nameWorker = sc.next();

        System.out.print("Level: ");
        String levelWorkerString = sc.next();

        WorkerLevel workerLevel = WorkerLevel.valueOf(levelWorkerString);

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker1 = new Worker(nameWorker, workerLevel, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int quantifyContracts = sc.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < quantifyContracts; i++) {
            System.out.println("Enter contract #"+(i+1)+" data: ");

            System.out.print("Date (DD/MM/YYYY): ");
            String dateString = sc.next();
            LocalDate date = LocalDate.parse(dateString, formatter);



            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();


            System.out.print("Duration (hours): ");
            int durationPerHour = sc.nextInt();

            HourContract contract = new HourContract(date,valuePerHour,durationPerHour);
            worker1.addContract(contract);
            System.out.println();

        }
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String yearAndMonth = sc.next();

        // Cria o padrão esperado pelo texto
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/yyyy");

        // Converte a String para um objeto YearMonth
        YearMonth ym = YearMonth.parse(yearAndMonth, fmt);

        // Extrai o mês e o ano para passar para o seu método
        int month = ym.getMonthValue();
        int year = ym.getYear();

        System.out.println("Name: " + worker1.getName());
        System.out.println("Department: " + worker1.getDepartment().getName());
        System.out.println("Income for " + yearAndMonth + ": " + String.format("%.2f", worker1.income(year, month)));
    }
}