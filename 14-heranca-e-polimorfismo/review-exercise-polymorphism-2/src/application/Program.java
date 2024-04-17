package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Product data %s%n data", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Price : ");
            double price = sc.nextDouble();

            if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateString = sc.next();
                Date manufactureDate = sdf.parse(dateString);

                products.add(new UsedProduct(name, price, manufactureDate));
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, fee));

            } else {
                products.add(new Product(name, price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
