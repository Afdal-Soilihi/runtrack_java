package JOUR2.job11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la hauteur du triangle
        System.out.print("Veuillez entrer la hauteur du triangle : ");
        int hauteur = scanner.nextInt();

        // Construire et afficher le triangle
        for (int i = 1; i <= hauteur; i++) {
            // Afficher les espaces pour aligner le triangle
            for (int j = hauteur; j > i; j--) {
                System.out.print(" ");
            }
            // Afficher les étoiles pour former le triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Passer à la ligne suivante
            System.out.println();
        }

        // Fermer le scanner
        scanner.close();
    }
}

