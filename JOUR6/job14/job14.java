package JOUR6.job14;

import java.util.Scanner;

public class Job14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (<= 9): ");
        int n = scanner.nextInt();

        if (n <= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("The number should be 9 or less.");
        }
    }
}

