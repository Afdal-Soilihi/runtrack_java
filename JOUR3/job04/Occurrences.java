package JOUR3.job04;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {
    public static void main(String[] args) {
        // Déclarer et initialiser le tableau avec les valeurs données
        int[] tableau = {3, 7, 3, 9, 8};

        // Utiliser une HashMap pour compter les occurrences de chaque nombre
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < tableau.length; i++) {
            int nombre = tableau[i];
            if (occurrences.containsKey(nombre)) {
                occurrences.put(nombre, occurrences.get(nombre) + 1);
            } else {
                occurrences.put(nombre, 1);
            }
        }

        // Afficher les occurrences de chaque nombre
        System.out.println("Occurrences de chaque nombre :");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Nombre " + entry.getKey() + " : " + entry.getValue() + " occurrence(s)");
        }
    }
}

