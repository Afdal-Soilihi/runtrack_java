package jour13;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le premier nombre
        System.out.print("Veuillez entrer le premier nombre : ");
        int nombre1 = scanner.nextInt();

        // Demander à l'utilisateur de saisir le deuxième nombre
        System.out.print("Veuillez entrer le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Calculer la somme des deux nombres
        int somme = nombre1 + nombre2;

        // Afficher le résultat
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);

        // Fermer le scanner
        scanner.close();
    }
}
