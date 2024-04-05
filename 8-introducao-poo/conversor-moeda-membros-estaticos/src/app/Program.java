package app;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How manu dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in BRL = %.2f%n ", CurrencyConverter.convertCurrency(amount, dollarPrice));

        sc.close();
    }
}
