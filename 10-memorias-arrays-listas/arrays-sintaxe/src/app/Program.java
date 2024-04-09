package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        double[] array = new double[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        double avg = sum / arrayLength;

        System.out.printf("Average: %.2f%n", avg);

        sc.close();
    }
}
