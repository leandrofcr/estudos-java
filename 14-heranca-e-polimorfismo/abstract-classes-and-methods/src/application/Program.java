package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Shape> shapeList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter #%s data: ", i);
            System.out.print("Rectangle or Circle? (r/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (type == 'r') {
                System.out.print("Width: ");
                double w = sc.nextDouble();
                System.out.print("Height: ");
                double h = sc.nextDouble();

                shapeList.add(new Rectangle(color, w, h));
            }

            if (type == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }

            System.out.println();
            System.out.println("SHAPE AREAS: ");

            for (Shape shape : shapeList) {
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println(df.format(shape.area()));
            }
        }

        sc.close();
    }
}
