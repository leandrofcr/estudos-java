package app;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        Product[] array = new Product[arrayLength];


        for (int i = 0; i < array.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            array[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (Product product : array) {
            sum += product.getPrice();
        }
        double avg = sum / array.length;

        System.out.printf("Average price: %.2f%n", avg);
        System.out.printf("Average price: %.2f%n", avg);

        sc.close();
    }
}
