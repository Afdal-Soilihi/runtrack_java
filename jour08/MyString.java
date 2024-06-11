package jour08;

public class MyString {
    public static void main(String[] args) {
        // Déclaration de quatre variables de type String de quatre façons différentes

        // Première façon : Déclaration et initialisation directe avec une valeur littérale
        String str1 = "Hello, World!";
        
        // Deuxième façon : Déclaration, puis initialisation avec une valeur littérale
        String str2;
        str2 = "Bonjour, le monde!";
        
        // Troisième façon : Utilisation du constructeur de la classe String
        String str3 = new String("Hola, Mundo!");
        
        // Quatrième façon : Initialisation avec une autre chaîne
        String baseString = "Salut, le monde!";
        String str4 = baseString;
        
        // Afficher les valeurs des chaînes
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
    }
}
