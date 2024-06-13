package JOUR3.job03;

public class NomsTableau {
    public static void main(String[] args) {
        // Déclarer et initialiser le tableau de strings avec les noms
        String[] noms = {"Josette", "John", "Myrtille", "Marc"};

        // Afficher la valeur "John" dans le terminal
        System.out.println("Valeur à l'index 1 : " + noms[1]);

        // Changer la valeur "Myrtille" par "Mireille"
        noms[2] = "Mireille";

        // Afficher les valeurs du tableau dans le terminal
        System.out.println("Valeurs du tableau :");
        for (int i = 0; i < noms.length; i++) {
            System.out.println("Index " + i + ": " + noms[i]);
        }
    }
}

