package JOUR4.job02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringToFile {

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

    public static void main(String[] args) {
        // Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la longueur de la chaîne de caractères
        System.out.print("Entrez la longueur de la chaîne de caractères à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Écrire la chaîne dans le fichier output.txt
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(randomString);
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de l'écriture dans le fichier.");
            e.printStackTrace();
        }

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer et afficher le temps d'exécution
        long executionTime = endTime - startTime;
        System.out.println("Le temps d'exécution du programme est : " + executionTime + " millisecondes.");
    }
}

