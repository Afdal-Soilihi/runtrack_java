package jour10;

import java.util.Scanner;

public class ConvertMinutes {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir le nombre de minutes
        System.out.print("Veuillez entrer le nombre de minutes : ");
        int totalMinutes = scanner.nextInt();
        
        // Convertir les minutes en heures et minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        
        // Afficher le résultat sous forme HH:MM
        System.out.printf("Le temps converti est : %02d:%02d\n", hours, minutes);
        
        // Fermer le scanner
        scanner.close();
    }
}
