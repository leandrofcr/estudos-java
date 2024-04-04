package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        // SOLUCAO SEM POO

//        double xA, xB, xC, yA, yB, yC;
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the measures of triangle X: ");
//        xA = sc.nextDouble();
//        xB = sc.nextDouble();
//        xC = sc.nextDouble();
//
//        System.out.println("Enter the measures of triangle Y: ");
//        yA = sc.nextDouble();
//        yB = sc.nextDouble();
//        yC = sc.nextDouble();
//
//        double p = (xA + xB + xC) / 2.0;
//        double areaX = Math.sqrt(p * (p -xA) * (p -xB) * (p-xC));
//
//        p = (yA + yB + yC) / 2.0;
//        double areaY = Math.sqrt(p * (p -yA) * (p -yB) * (p-yC));
//
//        System.out.printf("Triangle X area: %.4f%n", areaX);
//        System.out.printf("Triangle Y area: %.4f%n", areaY);
//
//        if(areaX > areaY){
//            System.out.println("Large area: X");
//        } else {
//            System.out.println("Large area: Y");
//        }
//
//        sc.close();


        // SOLUCAO COM POO

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.getArea();
        double areaY = y.getArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }

        sc.close();
    }
}
