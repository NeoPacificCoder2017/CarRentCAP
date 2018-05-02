/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationvoiture;

import java.util.*;

/**
 *
 * @author eleve9
 */
public class LocationVoiture {

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
    
    private static void initNvlleVoiture(Cars newCar) {
        print("\nImmatriculation du véhicule: ");
        newCar.setImmatriculation(scan.nextInt());
        print("\nNombre de passager ");
        newCar.setNbPassagerMax(scan.nextInt());
        print("\nTarif par jour: ");
        newCar.setPrixJour(scan.nextInt());
    }
}
