package JOUR4.job05;

import java.util.Scanner;

class CountingThread extends Thread {
    private int start;
    private int end;
    private int sum;

    public CountingThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum++;
        }
    }
}

public class ParallelCounting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        // Diviser le nombre maximum en deux plages de nombres égales
        int mid = maxNumber / 2;

        // Créer deux threads pour compter chaque plage de nombres
        CountingThread thread1 = new CountingThread(1, mid);
        CountingThread thread2 = new CountingThread(mid + 1, maxNumber);

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Lancer les deux threads
        thread1.start();
        thread2.start();

        // Attendre que les deux threads aient terminé
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

        // Afficher le compte total
        System.out.println("Le programme a compté jusqu'à : " + totalSum);
    }
}
