package locationvoiture;
import java.util.*;


public class LocationVoiture {
  
    private static final Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) {
      
    ArrayList<Customers> customer = new ArrayList<Customers>();
       
      int option = -1;

      while(option != 0) {
        Menu();
        option = scan.nextInt();
        
        switch(option) {
          case 1:
            
            break;
          case 2:
            Customers c = addNewCustomer();
              customer.add(c);
              break;
          case 3:
            listCustomer(customer);
            option = scan.nextInt();
            break;
          case 4:
              
            break;
          default:
            println("*********************************");
              if( option == 0){
                println("Merci");
              }else{
                println ("Choix incorrect !");
              }
        }
      }
      
    }
    
    //////////////////////////////Function///////////////////////////////////////
    
    public static void println(Object a){
        System.out.println(a);
    }
    
    public static void print(Object a){
        System.out.print(a);
    }
    
    public static void Menu(){
      println("*********************************");
      println("Veuillez sélectionner une option:"
              + "\n 1-Acquerir un véhicule"
              + "\n 2-Enregistrer nouveau client"
              + "\n 3-Louer véhicule"
              + "\n 4-Rendre véhicule"
              + "\n 0-Quitter");
      print("Votre choix: ");
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
      println("Voici la liste des clients1: ");
        for(Customers customer : customers ){
          index++;
            println("\n" + index + space + customer.getLastname() + space + customer.getFirstname() + space + customer.getAge() + " ans numéro de permis " + customer.getNumLicence() );
        }
    }
}
