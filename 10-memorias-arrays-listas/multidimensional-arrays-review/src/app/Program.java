package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println(rows);
        System.out.println(columns);

        int[][] mat = new int[rows][columns];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0;  < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }


        sc.close();


    }
}
