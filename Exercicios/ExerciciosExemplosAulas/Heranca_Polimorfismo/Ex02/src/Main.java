import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Employee #"+(i+1)+" data:");
            System.out.print("Outsourced (y/n): ");
            char outsorced = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsorced=='y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                employeeList.add(employee);
            }else if (outsorced=='n'){
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}