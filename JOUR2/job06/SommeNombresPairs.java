package JOUR2.job06;

public class SommeNombresPairs {
    public static void main(String[] args) {
        int somme = 0;

        // Parcourir les nombres de 1 à 100
        for (int i = 1; i <= 100; i++) {
            // Vérifier si le nombre est pair
            if (i % 2 == 0) {
                // Ajouter le nombre pair à la somme
                somme += i;
            }
        }

        // Afficher la somme des nombres pairs
        System.out.println("La somme des nombres pairs de 1 à 100 est : " + somme);
    }
}
