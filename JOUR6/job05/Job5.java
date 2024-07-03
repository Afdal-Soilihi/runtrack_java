package JOUR6.job05;

import java.util.Scanner;

public class Job5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The square of " + number + " is " + (number * number));
    }
}

