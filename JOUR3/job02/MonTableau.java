package JOUR3.job02;

public class MonTableau {
    public static void main(String[] args) {
        // Déclarer et initialiser le tableau avec des valeurs initiales
        int[] monTableau = {12, 6, 76, 89};

        // Afficher les valeurs initiales du tableau
        System.out.println("Valeurs initiales du tableau :");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("Index " + i + ": " + monTableau[i]);
        }

        // Assigner de nouvelles valeurs au tableau
        monTableau[0] = 42;
        monTableau[1] = 35;
        monTableau[2] = 97;
        monTableau[3] = 58;

        // Afficher les nouvelles valeurs du tableau
        System.out.println("Nouvelles valeurs du tableau :");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("Index " + i + ": " + monTableau[i]);
        }
    }
}
