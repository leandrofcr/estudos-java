package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("withdrawal limit: ");
            double withdrawalLimit = sc.nextDouble();
            Account acc = new Account(number, holder, balance, withdrawalLimit);

            System.out.println();
            System.out.print("Enter amount for withdrawal: ");
            double withdrawalAmount = sc.nextDouble();
            acc.withdrawal(withdrawalAmount);
            System.out.println("New balance: " + String.format("%.2f%n", acc.getBalance()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error in withdrawal: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
