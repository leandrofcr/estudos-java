package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();
        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.printf("Employee #%s%n data: ", i);
            System.out.print("Outsourced (y/n)? ");
            char isOutsource = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (isOutsource == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
            System.out.println();
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
        sc.close();

    }
}
