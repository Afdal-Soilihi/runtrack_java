package JOUR3.job08;

import java.util.Arrays;

public class TrierMatrice {
    public static void main(String[] args) {
        // Déclarer et initialiser la matrice
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        // Afficher la matrice initiale
        System.out.println("Matrice initiale :");
        afficherMatrice(tableau);

        // Trier chaque ligne
        for (int i = 0; i < tableau.length; i++) {
            Arrays.sort(tableau[i]);
        }

        // Transposer la matrice
        int[][] transposee = transposer(tableau);

        // Trier chaque ligne de la matrice transposée (ce qui revient à trier les colonnes de la matrice originale)
        for (int i = 0; i < transposee.length; i++) {
            Arrays.sort(transposee[i]);
        }

        // Transposer de nouveau pour revenir à la matrice originale avec les colonnes triées
        tableau = transposer(transposee);

        // Afficher la matrice triée
        System.out.println("Matrice triée :");
        afficherMatrice(tableau);
    }

    // Méthode pour afficher la matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Méthode pour transposer une matrice
    public static int[][] transposer(int[][] matrice) {
        int[][] transposee = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                transposee[j][i] = matrice[i][j];
            }
        }
        return transposee;
    }
}

