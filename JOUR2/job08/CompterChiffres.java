package JOUR2.job08;

import java.util.Scanner;

public class CompterChiffres {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Veuillez entrer un nombre : ");
        int numero = scanner.nextInt();

        // Convertir le nombre en chaîne de caractères pour compter les chiffres
        String numeroStr = Integer.toString(numero);

        // Compter le nombre de chiffres dans la chaîne de caractères
        int nombreDeChiffres = numeroStr.length();

        // Afficher le résultat
        System.out.println("Le nombre de chiffres dans " + numero + " est : " + nombreDeChiffres);

        // Fermer le scanner
        scanner.close();
    }
}

