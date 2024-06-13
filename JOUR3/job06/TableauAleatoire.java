package JOUR3.job06;

import java.util.Random;

public class TableauAleatoire {
    public static void main(String[] args) {
        // Déclarer et initialiser un tableau pour contenir 10 entiers
        int[] tableau = new int[10];

        // Créer une instance de la classe Random pour générer des nombres aléatoires
        Random random = new Random();

        // Remplir le tableau avec des nombres aléatoires
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); // Générer un nombre aléatoire entre 0 et 99
        }

        // Afficher les valeurs du tableau dans le terminal
        System.out.println("Valeurs du tableau :");
        for (int valeur : tableau) {
            System.out.println(valeur);
        }
    }
}
