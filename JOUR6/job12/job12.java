package JOUR6.job12;

import java.util.Scanner;

public class Job12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
