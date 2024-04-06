package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        // os dados sao informados ao instanciar o produto
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        product.addProducts(quantityToAdd);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }
}
