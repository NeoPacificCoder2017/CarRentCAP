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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner saisie = new Scanner(System.in);
        int noImma, nbPassagerMax, prixJour, km, nbLocation;
        boolean statut;
        
        // Menu 
        
        // Demande de saisie de l'utilisateur pour un nouveau véhicule
        print(" Entrez le numéro immatricualation :");
        noImma = saisie.nextInt();
        print(" Entrez le nombre de passager maximum :");
        nbPassagerMax = saisie.nextInt();
        print(" Entrez le numéro immatricualation :");
        noImma = saisie.nextInt();
        print(" Entrez le numéro immatricualation :");
        noImma = saisie.nextInt();
        print(" Entrez le numéro immatricualation :");
        noImma = saisie.nextInt();
        print(" Entrez le numéro immatricualation :");
        noImma = saisie.nextInt();
        
        
    }
    
    public static void print(Object a){
        System.out.print(a);
    }
    
    public static void stockCars() {
        
    }
    
}
