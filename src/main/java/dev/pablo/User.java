package dev.pablo;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NationalDNI nationalDNI = new NationalDNI();

        while (true) {
            System.out.print("Enter the DNI number (or 'cancel' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("cancel")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                char letter = nationalDNI.calculateLetter(number);
                System.out.println("The letter for DNI number " + number + " is: " + letter);
                System.out.println("Complete DNI: " + nationalDNI.getFullDNI());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Program ended");
    }
}
