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
        ArrayList<Customers> customers = new ArrayList<Customers>();

        // test data clients
        String[] noms = new String[]{"CHANSAUD", "HAUATA", "LYSAO", "MANA", "MAUI", "TAIE", "TARIHAA", "TKT", "TEPA", "TUHITI"};
        String[] prenoms = new String[]{"Gaby", "Sabrina", "Miron", "Kévin", "Apetahi", "Parea", "Teraitea", "Cédric", "Vaiarii", "Christopher"};
        int[] ages = new int[]{17, 17, 17, 17, 17, 17, 17, 17, 17, 17};
        int[] permis = new int[]{11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999, 14578};
        
        for(int i = 0; i < noms.length; i++) {
            customers.add(new Customers(prenoms[i], noms[i], ages[i], permis[i]));
        }
      
        // test data véhicules
        int[] immatriculations = new int[]{111111111, 222222222, 333333333, 444444444, 555555555, 666666666, 777777777, 888888888, 999999999, 1212121212, 1313131313, 1414141414, 1515151515, 1616161616, 1717171717};
        int[] passagers = new int[]{5, 5, 5, 5, 3, 5, 3, 5, 3, 3, 3, 5, 5, 5, 5};
        int[] tarifs = new int[]{7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000};
        
        for(int i = 0; i < immatriculations.length; i++) {
            vehicles.add(new Cars());
            vehicles.get(i).setImmatriculation(immatriculations[i]);
            vehicles.get(i).setNbPassagerMax(passagers[i]);
            vehicles.get(i).setPrixJour(tarifs[i]);
        }
        
        // création d'un client
        Customers c = addNewCustomer();
        customers.add(c);
        
        // Création d'un nouveau véhicule
        Cars newCar = addCar();
        vehicles.add(newCar);
        
        //Payer montant location
        afficheMontantAPayer(rents);
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
        
        rent.getCar().setKm(50 * rent.getPeriod());//Permet d'ajouter 50 km par jour de location
        rent.getCar().setStatut(true);//Permet de passer d'indisponible à disponible
<<<<<<< HEAD
        rent.getCar().setNbLocation(rent.getCar().getNbLocation()++);
=======
        rent.getCar().setNbLocation(getNbLocation()++);
>>>>>>> 8574510be77d3b3233d0736387f86aae777c5bcc
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
    
    private static void initNvlleVoiture(Cars newCar) {
        print("\nImmatriculation du véhicule: ");
        newCar.setImmatriculation(scan.nextInt());
        print("\nNombre de passager ");
        newCar.setNbPassagerMax(scan.nextInt());
        print("\nTarif par jour: ");
        newCar.setPrixJour(scan.nextInt());
    }
    
    private static Cars addCar(){
        Cars newCar = new Cars();
        
        listTypeVehicle();
        int choix = scan.nextInt();
        
        switch(choix) {
            case 1:
                newCar = new Citadine();
                break;
            case 2:
                newCar = new Berline();
                break;
            case 3:
                newCar = new SUV();
                break;
            default:
                print("\nDésolé ce type de voiture n'existe pas");
        }
        
        initNvlleVoiture(newCar);
        
        return newCar;
        
    }
}

