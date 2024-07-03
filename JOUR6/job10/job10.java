package JOUR6.job10;

import java.util.Scanner;

public class Job10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
    }
}

