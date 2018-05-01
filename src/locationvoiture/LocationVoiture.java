package locationvoiture;
import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

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
    
}

