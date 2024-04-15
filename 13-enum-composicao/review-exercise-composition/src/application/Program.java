package application;

import entities.enums.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println("Enter order data:");

        System.out.print("Status: ");
        String status = sc.next();
        OrderStatus orderStatus = OrderStatus.valueOf(status);
        System.out.print("How many items to this order: ");
        int numberOfItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), orderStatus, new Customer(name, email, birthDate));

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.printf("Enter #%s%n item data: ", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));

            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        sc.close();
    }
}
