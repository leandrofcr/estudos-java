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

        int[][] mat = new int[rows][columns];

        for (int i = 0; i < mat.length; i++) {
            System.out.print("Enter array data: ");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number to be verified: ");
        int numberToTrack = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numberToTrack) {
                    System.out.println();
                    System.out.println("Position: " + i + "," + j);

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }

                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }

                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }

                }
            }
        }


        sc.close();


    }
}
