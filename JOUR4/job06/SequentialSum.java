package JOUR4.job06;

import java.util.Scanner;

public class SequentialSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        // Initialiser le tableau
        int[] numbers = new int[size];

        // Demander à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Calculer la somme des éléments du tableau
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer et afficher le temps d'exécution
        long executionTime = endTime - startTime;
        System.out.println("Le temps d'exécution du programme est : " + executionTime + " millisecondes.");

        // Afficher la somme totale
        System.out.println("La somme totale des éléments du tableau est : " + sum);
    }
}




