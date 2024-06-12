package JOUR2.job09;

public class PremierDernierChiffre {
    public static void main(String[] args) {
        int nombre = 1234;

        // Récupérer le dernier chiffre
        int dernierChiffre = nombre % 10;

        // Récupérer le premier chiffre en divisant par 10 jusqu'à obtenir un seul chiffre
        int premierChiffre = nombre;
        while (premierChiffre >= 10) {
            premierChiffre /= 10;
        }

        // Afficher le premier et le dernier chiffre
        System.out.println("Le premier chiffre de " + nombre + " est : " + premierChiffre);
        System.out.println("Le dernier chiffre de " + nombre + " est : " + dernierChiffre);
    }
}
