package JOUR2.job05;

import java.util.Scanner;

public class VerificationAge {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir son âge
        System.out.print("Veuillez entrer votre âge : ");
        int age = scanner.nextInt();

        // Vérifier les différentes conditions pour l'âge
        if (age < 16) {
            System.out.println("Vous êtes trop jeune pour travailler.");
        } else if (age > 55 && age < 67) {
            System.out.println("Il sera difficile de trouver un emploi.");
        } else if (age == 67) {
            System.out.println("Vous êtes à la retraite.");
        } else {
            System.out.println("Vous êtes en âge de travailler.");
        }

        // Fermer le scanner
        scanner.close();
    }
}

