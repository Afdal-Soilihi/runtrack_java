package jour11;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la première chaîne
        System.out.print("Veuillez entrer la première chaîne (chaine1) : ");
        String chaine1 = scanner.nextLine();

        // Demander à l'utilisateur de saisir la deuxième chaîne
        System.out.print("Veuillez entrer la deuxième chaîne (chaine2) : ");
        String chaine2 = scanner.nextLine();

        // Afficher les valeurs initiales
        System.out.println("Avant l'échange :");
        System.out.println("chaine1 : " + chaine1);
        System.out.println("chaine2 : " + chaine2);

        // Échanger les valeurs sans utiliser de variable supplémentaire
        chaine1 = chaine1 + chaine2; // Concaténer chaine2 à la fin de chaine1
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); // Extraire la nouvelle valeur de chaine2
        chaine1 = chaine1.substring(chaine2.length()); // Extraire la nouvelle valeur de chaine1

        // Afficher les valeurs après l'échange
        System.out.println("Après l'échange :");
        System.out.println("chaine1 : " + chaine1);
        System.out.println("chaine2 : " + chaine2);

        // Fermer le scanner
        scanner.close();
    }
}
