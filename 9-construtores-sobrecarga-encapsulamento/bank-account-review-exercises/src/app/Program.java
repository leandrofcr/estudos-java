package app;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char hasInitialBalance = sc.next().charAt(0);
        double balance;

        BankAccount userBankAcc;

        if (hasInitialBalance == 'y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            userBankAcc = new BankAccount(number, holder, balance);
        } else {
            userBankAcc = new BankAccount(number, holder);

        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(userBankAcc);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        userBankAcc.deposit(depositAmount);
        System.out.println("Updated account data:");
        System.out.println(userBankAcc);
        System.out.println();

        System.out.print("Enter a withdrawal value: ");
        double withdrawalAmount = sc.nextDouble();
        userBankAcc.withdrawal(withdrawalAmount);
        System.out.println("Updated account data:");
        System.out.println(userBankAcc);


        sc.close();

    }
}
