package locationvoiture;
import java.util.*;

/**
 *
 * @author eleve9
 */
public class LocationVoiture {
<<<<<<< HEAD
  
    private static Scanner scan = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
=======

    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<Rent> stockCars = new ArrayList<Rent>();
    }
    
    private static void print(Object a){
        System.out.print(a);
    }
    
    private static void afficheMontantAPayer(ArrayList<Rent> tabs) {
        
        Rent rent = null;
        print("*************** Retour Véhicule ***************");
        do {        
            print("\nSaisissez le numéro de location : ");
            int noL = scan.nextInt();
            rent = rechercheVehiculeLoue(tabs, noL);
            if(rent == null){
                print("\nLe numéro saisie n'existe pas, veuillez réessayer.");
            }
        }while(rent == null);
>>>>>>> 3493f134bb3fd29a98580a1a370506400fed5281
        
        print("\nLe montant à payer est de : " + rent.getCost());
    }
    
    private static Rent rechercheVehiculeLoue(ArrayList<Rent> tabs, int noLoc){
        Rent rent = null; 
        
        for(Rent tab : tabs) {
            if (noLoc == tab.getCode()) {
                rent = tab;
            }
        }
        return rent; 
    }
    
}
