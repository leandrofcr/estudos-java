package app;

import entities.Guest;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        final int NUMBER_OF_ROOMS = 10;
        Scanner sc = new Scanner(System.in);
        Guest[] guests = new Guest[NUMBER_OF_ROOMS];

        System.out.print("How many rooms wil be rented? ");
        int numberOfGuest = sc.nextInt();

        for (int i = 0; i < numberOfGuest; i++) {
            System.out.println();
            System.out.printf("Rent #%s%n ", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            guests[room] = new Guest(name, email, room);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (Guest guest : guests) {
            if (guest != null) {
                System.out.println(guest.toString());
            }
        }
        sc.close();
    }
}
