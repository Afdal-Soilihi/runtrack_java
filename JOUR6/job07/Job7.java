package JOUR6.job07;

import java.util.Scanner;

public class Job7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            sum += scanner.nextInt();
        }

        double average = sum / 5.0;
        System.out.println("The average is: " + average);
    }
}

