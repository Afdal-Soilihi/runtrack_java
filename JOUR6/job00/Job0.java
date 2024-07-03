package JOUR6.job00;

public class Job0 {
    public static void main(String[] args) {
        char charVar = 'A';
        String stringVar = "Hello";
        int intVar = 10;
        long longVar = 100000L;
        float floatVar = 10.5f;
        boolean booleanVar = true;

        System.out.println("charVar: " + charVar);
        System.out.println("stringVar: " + stringVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("booleanVar: " + booleanVar);

        int TOTO = (int) 3.817;  // Casting 3.817 to int results in 3
        System.out.println("TOTO: " + TOTO);  // It will display 3
    }
}
