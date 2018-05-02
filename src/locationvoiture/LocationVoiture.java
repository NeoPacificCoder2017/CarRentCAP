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
      ArrayList<Cars> vehicles = new ArrayList<Cars>();
      ArrayList<Rent> rents = new ArrayList<Rent>();
    }
    
    public static void print(Object a){
      System.out.print(a);
    }
    //////////////////////////////Function print///////////////////////////////////////

    public static void println(Object a){
        System.out.println(a);
    }

    //////////////////////////////Ajouter un nouveau client///////////////////////////////////////

    public static Customers addNewCustomer(){
        println("*********************************"
        + "\n*********************************");
        println("Ajouter un nouveau client: ");

        print("Nom: ");
        String lastName = scan.next();

        print("Prénom: ");
        String firstName = scan.next();

        print("Age: ");
        int age = scan.nextInt();

        print("N° Permis: ");
        int numberLicence = scan.nextInt();
        return new Customers(firstName, lastName, age, numberLicence);
    }
    
    ////////////////////////////Affichage des client enregistrer/////////////////////////////////////
    
    public static void listCustomer(ArrayList<Customers> customers){
      int index = 0;
      String space = " ";
      println("Voici la liste des types des clients1: ");
        for( Customers customer : customers ){
          index++;
            println("\n" + index + space + customer.getLastname() + space + customer.getFirstname() + space + customer.getAge());
        }
    }
    
    private static void displayMainMenu() {
        println("\n*********************************");
        println("Sélectionner une option \n\n\t 1. Acquérir voiture \n\t 2. Enregistrer nouveau client \n\t 3. Louer véhicule \n\t 4. Rendre véhicule \n\t 0. Quitter\n");
        print("Votre choix: ");
    }
    
    private static void displayRent(ArrayList<Rent> rents, int value) {
      Rent rent = rents.get(value);

      println("\n************** Location *******************");
      println("\n Location n°: " + rent.getCode() + "\n Voiture immatriculée: " + rent.getCar().getImmatriculation() + "\n Louée par: " + rent.getCustomer().getLastname() + " " + rent.getCustomer().getFirstname());
    }
    
    /////////////////////////////////Affficher la liste des différents type de véhicuel//////////////
    
    private static void listTypeVehicle(){
      println("\n*********************************");
      println("Liste des types de véhicule");
      println("Sélectionner le type de véhicule: \n\t 1. Citadine \n\t 2. Berline \n\t 3. SUV");
      print("Votre choix: "); 
    }  
    
    /////////////////////////////////Affficher la liste des différents véhicule par type//////////////
    
    public static void listVehiculeByType(ArrayList<Cars> vehicles, String type){
      int index = 0;
      for(Cars vehicle : vehicles){
        if(vehicle.getNom() == type && vehicle.isStatut()){
          index++;
          print(index + ". " + vehicle.getNbPassagerMax() + " " + vehicle.getPrixJour() + " disponibilité: " + vehicle.isStatut());
        }
      }
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

