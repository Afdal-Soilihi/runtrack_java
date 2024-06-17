package JOUR4.job07;

import java.util.Scanner;

class SumCalculator extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public SumCalculator(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}

public class ParallelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        // Initialiser le tableau
        int[] numbers = new int[size];

        // Demander à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau (séparés par des espaces) :");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Diviser le tableau en deux moitiés
        int mid = size / 2;

        // Créer deux threads pour calculer la somme des deux moitiés du tableau
        SumCalculator thread1 = new SumCalculator(numbers, 0, mid);
        SumCalculator thread2 = new SumCalculator(numbers, mid, size);

        // Lancer les threads
        thread1.start();
        thread2.start();

        // Attendre que les threads terminent leur exécution
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combiner les résultats des deux threads
        int totalSum = thread1.getSum() + thread2.getSum();

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer et afficher le temps d'exécution
        long executionTime = endTime - startTime;
        System.out.println("Le temps d'exécution du programme est : " + executionTime + " millisecondes.");

        // Afficher la somme totale
        System.out.println("La somme totale des éléments du tableau est : " + totalSum);
    }
}

