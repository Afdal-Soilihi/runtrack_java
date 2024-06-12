package JOUR2.job03;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un chiffre
        System.out.print("Veuillez entrer un chiffre : ");
        int nombre = scanner.nextInt();

        // Afficher la table de multiplication du nombre saisi
        System.out.println("Table de multiplication de " + nombre + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }

        // Fermer le scanner
        scanner.close();
    }
}
