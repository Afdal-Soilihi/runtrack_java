package JOUR8.job4;

import java.util.Date;
import java.util.Vector;
import java.util.Scanner;

public class Commerciale {
    private Vector<Article> articles = new Vector<>();
    private Vector<Client> clients = new Vector<>();
    private Vector<Commande> commandes = new Vector<>();
    private Vector<Ligne> lignes = new Vector<>();

    public void ajouterArticle(Article a) {
        articles.add(a);
    }

    public void supprimerArticle(Article a) {
        articles.remove(a);
    }

    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

    public void passerCommande(Commande c) {
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Commerciale commerciale = new Commerciale();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ajouter un article");
            System.out.println("2. Supprimer un article");
            System.out.println("3. Ajouter un client");
            System.out.println("4. Supprimer un client");
            System.out.println("5. Passer une commande");
            System.out.println("6. Annuler une commande");
            System.out.println("7. Quitter");
            int choix = sc.nextInt();
            sc.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.println("Référence: ");
                    int ref = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Désignation: ");
                    String desig = sc.nextLine();
                    System.out.println("Prix Unitaire: ");
                    double prix = sc.nextDouble();
                    System.out.println("Quantité en Stock: ");
                    int quant = sc.nextInt();
                    sc.nextLine();
                    Article a = new Article(ref, desig, prix, quant);
                    commerciale.ajouterArticle(a);
                    break;
                case 2:
                    System.out.println("Référence de l'article à supprimer: ");
                    ref = sc.nextInt();
                    sc.nextLine();
                    Article aSup = null;
                    for (Article art : commerciale.articles) {
                        if (art.getReference() == ref) {
                            aSup = art;
                            break;
                        }
                    }
                    if (aSup != null) {
                        commerciale.supprimerArticle(aSup);
                        System.out.println("Article supprimé.");
                    } else {
                        System.out.println("Article non trouvé.");
                    }
                    break;
                case 3:
                    System.out.println("Identité: ");
                    int ident = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nom Social: ");
                    String nom = sc.nextLine();
                    System.out.println("Adresse: ");
                    String addr = sc.nextLine();
                    System.out.println("Chiffre d'Affaire: ");
                    double ca = sc.nextDouble();
                    sc.nextLine();
                    Client c = new Client(ident, nom, addr, ca);
                    commerciale.ajouterClient(c);
                    break;
                case 4:
                    System.out.println("Identité du client à supprimer: ");
                    ident = sc.nextInt();
                    sc.nextLine();
                    Client cSup = null;
                    for (Client cl : commerciale.clients) {
                        if (cl.getIdentite() == ident) {
                            cSup = cl;
                            break;
                        }
                    }
                    if (cSup != null) {
                        commerciale.supprimerClient(cSup);
                        System.out.println("Client supprimé.");
                    } else {
                        System.out.println("Client non trouvé.");
                    }
                    break;
                case 5:
                    System.out.println("Numéro de commande: ");
                    int numCommande = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Date de commande (yyyy-mm-dd): ");
                    String date = sc.nextLine();
                    Date dateCommande = java.sql.Date.valueOf(date);
                    System.out.println("Identité du client: ");
                    ident = sc.nextInt();
                    sc.nextLine();
                    Client clientCommande = null;
                    for (Client cl : commerciale.clients) {
                        if (cl.getIdentite() == ident) {
                            clientCommande = cl;
                            break;
                        }
                    }
                    if (clientCommande != null) {
                        Commande cmd = new Commande(numCommande, dateCommande, clientCommande);
                        commerciale.passerCommande(cmd);
                        System.out.println("Commande ajoutée.");
                    } else {
                        System.out.println("Client non trouvé.");
                    }
                    break;
                case 6:
                    System.out.println("Numéro de commande à annuler: ");
                    numCommande = sc.nextInt();
                    sc.nextLine();
                    Commande cAnnuler = null;
                    for (Commande cmd : commerciale.commandes) {
                        if (cmd.getNumeroCommande() == numCommande) {
                            cAnnuler = cmd;
                            break;
                        }
                    }
                    if (cAnnuler != null) {
                        commerciale.annulerCommande(cAnnuler);
                        System.out.println("Commande annulée.");
                    } else {
                        System.out.println("Commande non trouvée.");
                    }
                    break;
                case 7:
                    sc.close();
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix non valide.");
                    break;
            }
        }
    }
}
