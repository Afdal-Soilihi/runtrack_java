package jour05;

public class ExerciceVariables {
    public static void main(String[] args) {
        // Déclarer deux variables entières et leur assigner des valeurs initiales
        int num1 = 10;
        int num2 = 20;
        
        // Afficher les valeurs initiales de num1 et num2
        System.out.println("Valeur initiale de num1 : " + num1);
        System.out.println("Valeur initiale de num2 : " + num2);
        
        // Échanger les valeurs de num1 et num2
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Afficher les nouvelles valeurs de num1 et num2 après l'échange
        System.out.println("Nouvelle valeur de num1 : " + num1);
        System.out.println("Nouvelle valeur de num2 : " + num2);
    }
}
