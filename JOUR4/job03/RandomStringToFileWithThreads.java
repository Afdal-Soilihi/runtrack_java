package JOUR4.job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringToFileWithThreads {

    // Méthode pour générer une chaîne de caractères aléatoire
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    // Classe interne pour écrire dans le fichier avec un thread
    static class FileWriterThread extends Thread {
        private String data;
        private String filePath;
        private boolean append;

        public FileWriterThread(String data, String filePath, boolean append) {
            this.data = data;
            this.filePath = filePath;
            this.append = append;
        }

        @Override
        public void run() {
            try (FileWriter writer = new FileWriter(filePath, append)) {
                writer.write(data);
            } catch (IOException e) {
                System.out.println("Une erreur est survenue lors de l'écriture dans le fichier.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la longueur de la chaîne de caractères
        System.out.print("Entrez la longueur de la chaîne de caractères à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Diviser la chaîne en deux moitiés
        String firstHalf = randomString.substring(0, length / 2);
        String secondHalf = randomString.substring(length / 2);

        // Chemin du fichier de sortie
        String filePath = "output.txt";

        // Créer les threads pour écrire dans le fichier
        Thread thread1 = new FileWriterThread(firstHalf, filePath, false); // Ne pas append pour le premier thread
        Thread thread2 = new FileWriterThread(secondHalf, filePath, true); // Append pour le deuxième thread

        // Démarrer les threads
        thread1.start();
        thread2.start();

        // Attendre la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer et afficher le temps d'exécution
        long executionTime = endTime - startTime;
        System.out.println("Le temps d'exécution du programme est : " + executionTime + " millisecondes.");
    }
}

