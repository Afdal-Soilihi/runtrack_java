package jour12;

import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier
        System.out.print("Veuillez entrer un nombre entier : ");
        int n = scanner.nextInt();

        // Afficher les nombres de 1 à n
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
        }

        // Fermer le scanner
        scanner.close();
    }
}
