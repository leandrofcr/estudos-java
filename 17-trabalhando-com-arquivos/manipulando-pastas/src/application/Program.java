package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println("Path: " + folder);
            System.out.println("Name: " + folder.getName());
            System.out.println("---");
        }

        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {

            System.out.println("Path: " + file);
            System.out.println("Name: " + file.getName());
            System.out.println("---");
        }

        boolean success = new File(strPath + "/subDir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
