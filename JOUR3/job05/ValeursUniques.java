package JOUR3.job05;

import java.util.HashSet;
import java.util.Set;

public class ValeursUniques {
    public static void main(String[] args) {
        // Déclarer et initialiser le tableau avec des valeurs
        int[] tableau = {3, 7, 3, 9, 8, 7, 10};

        // Utiliser un HashSet pour trouver les valeurs uniques
        Set<Integer> valeursUniques = new HashSet<>();

        for (int nombre : tableau) {
            valeursUniques.add(nombre);
        }

        // Afficher les valeurs uniques
        System.out.println("Valeurs uniques du tableau :");
        for (int valeur : valeursUniques) {
            System.out.println(valeur);
        }
    }
}
