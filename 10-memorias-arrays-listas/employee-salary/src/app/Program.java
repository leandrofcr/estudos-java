package app;

import app.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employee will be registered? ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println();
            System.out.printf("Employee #%s%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        Employee employeeData = getEmployeeById(employees, employeeId);

        if (employeeData != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employeeData.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");

        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        sc.close();
    }

    public static Employee getEmployeeById(List<Employee> list, int id) {
        return list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

}
