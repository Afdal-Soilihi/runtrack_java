package JOUR3.job07;

public class Matrices {
    public static void main(String[] args) {
        // Déclarer et initialiser les matrices
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Afficher les valeurs de matrice1
        System.out.println("Valeurs de matrice1 :");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }

        // Additionner les valeurs de matrice1 et matrice2
        int[][] matriceSomme = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                matriceSomme[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        // Afficher le résultat de l'addition des matrices
        System.out.println("\nSomme de matrice1 et matrice2 :");
        for (int i = 0; i < matriceSomme.length; i++) {
            for (int j = 0; j < matriceSomme[i].length; j++) {
                System.out.print(matriceSomme[i][j] + " ");
            }
            System.out.println();
        }
    }
}

