package JOUR6.job11;

public class Job11 {
    public static void main(String[] args) {
        int n = 8;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of 8 is: " + factorial);
    }
}

