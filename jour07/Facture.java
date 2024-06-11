package jour07;

public class Facture {
    public static void main(String[] args) {
        // Déclarer les variables prix et quantite
        double prix = 49.99;
        int quantite = 3;

        // Calculer le montant hors taxe (HT)
        double tarifHT = prix * quantite;

        // Déclarer la variable tva (20%)
        double tva = 0.20;

        // Calculer le montant TTC
        double tarifTTC = tarifHT * (1 + tva);

        // Afficher les différentes valeurs de la facture
        System.out.println("Prix unitaire : " + prix);
        System.out.println("Quantité : " + quantite);
        System.out.println("Montant HT : " + tarifHT);
        System.out.println("TVA (20%) : " + (tarifHT * tva));
        System.out.println("Montant TTC : " + tarifTTC);
    }
}
