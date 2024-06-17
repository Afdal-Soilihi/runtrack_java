package JOUR4.job04;

import java.util.Scanner;

public class SequentialCounting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Compter de 1 jusqu'au nombre maximum
        for (int i = 1; i <= maxNumber; i++) {
            // Afficher chaque nombre (optionnel, peut être commenté pour une exécution plus rapide)
            // System.out.println(i);
        }

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer et afficher le temps d'exécution
        long executionTime = endTime - startTime;
        System.out.println("Le temps d'exécution du programme est : " + executionTime + " millisecondes.");

        // Afficher le compte total
        System.out.println("Le programme a compté jusqu'à : " + maxNumber);
    }
}
