package jour09;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander le prénom de l'utilisateur et stocker la valeur dans une variable
        System.out.print("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine();
        
        // Demander le nom de l'utilisateur et stocker la valeur dans une variable
        System.out.print("Veuillez entrer votre nom : ");
        String nom = scanner.nextLine();
        
        // Concaténer et afficher le prénom et le nom
        String fullName = prenom + " " + nom;
        System.out.println("Bonjour, " + fullName + "!");
        
        // Fermer le scanner
        scanner.close();
    }
}
