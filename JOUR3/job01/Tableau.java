package JOUR3.job01;

public class Tableau {
    public static void main(String[] args) {
        // Déclarer un tableau de cinq éléments de type int
        int[] tableau = new int[5];

        // Assigner des valeurs aux indices spécifiques du tableau
        tableau[0] = 10; // Index 0
        tableau[2] = 2;  // Index 2
        tableau[4] = 69; // Index 4

        // Afficher les valeurs du tableau
        System.out.println("Valeurs du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + ": " + tableau[i]);
        }

        // Afficher la valeur de l'index 1
        System.out.println("Valeur de l'index 1 : " + tableau[1]);
    }
}

