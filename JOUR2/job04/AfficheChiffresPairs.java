package JOUR2.job04;

public class AfficheChiffresPairs {
    public static void main(String[] args) {
        // Utiliser une boucle for pour afficher les chiffres pairs de 0 à 100
        for (int i = 0; i <= 100; i++) {
            // Vérifier si le nombre est pair
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
