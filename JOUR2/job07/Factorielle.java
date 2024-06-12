package JOUR2.job07;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        // Calculer la factorielle du nombre saisi
        long factorielle = 1;
        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

        // Afficher le résultat
        System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);

        // Fermer le scanner
        scanner.close();
    }
}
