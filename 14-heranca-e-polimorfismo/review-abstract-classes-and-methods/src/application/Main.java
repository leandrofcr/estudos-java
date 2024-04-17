package application;

import entities.BusinessTaxpayer;
import entities.IndividualTaxpayer;
import entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Taxpayer> taxpayerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();

                taxpayerList.add(new IndividualTaxpayer(name, income, healthExpenses));
            }

            if (type == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                sc.nextLine();
                taxpayerList.add(new BusinessTaxpayer(name, income, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double totalTaxes = 0;

        for (Taxpayer tp : taxpayerList) {
            totalTaxes += tp.totalTaxPaid();
            System.out.println(tp);
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
