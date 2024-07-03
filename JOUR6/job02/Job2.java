package JOUR6.job02;

import java.util.Scanner;

public class Job2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Bonjour " + firstName);
    }
}

