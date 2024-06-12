package JOUR2.job10;

public class SommeChiffres {
    public static void main(String[] args) {
        int nombre = 1234;
        int somme = 0;

        // Additionner tous les chiffres du nombre
        while (nombre > 0) {
            // Extraire le dernier chiffre du nombre
            int dernierChiffre = nombre % 10;
            // Ajouter le dernier chiffre à la somme
            somme += dernierChiffre;
            // Enlever le dernier chiffre du nombre
            nombre /= 10;
        }

        // Afficher la somme des chiffres
        System.out.println("La somme des chiffres est : " + somme);
    }
}

