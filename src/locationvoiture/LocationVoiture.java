package locationvoiture;
import java.util.*;

/**
 *
 * @author eleve9
 */
public class LocationVoiture {
    
    private static Scanner scan = new Scanner(System.in);
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayMainMenu();
    }
    
    public static void print(Object a){
        System.out.print(a);
    }
    
    private static void displayMainMenu() {
        System.out.println("\n*********************************");
        System.out.println("Sélectionner une option \n\n\t 1. Acquérir voiture \n\t 2. Enregistrer nouveau client \n\t 3. Louer véhicule \n\t 4. Rendre véhicule \n\t 0. Quitter\n");
        print("Votre choix: ");
    }
}
