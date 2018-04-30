/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationvoiture;

/**
 *
 * @author eleve9
 */
public class Cars {
    
    protected int immatriculation, nbPassagerMax, prixJour, km, nbLocation;
    protected boolean statut;
    protected String type; //nom du modèle
    
    public Cars(){
        
    }

    public Cars(int noImma, int nbPassagerMax, int prixJour, String type) {
        this.immatriculation = noImma;
        this.nbPassagerMax = nbPassagerMax;
        this.prixJour = prixJour;
        this.km = 0;
        this.nbLocation = 0;
        this.statut = true; // true = dispo
        this.type = type;
    }

    public int getImmatriculation() {
        return this.immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getNbPassagerMax() {
        return this.nbPassagerMax;
    }

    public void setNbPassagerMax(int nbPassagerMax) {
        this.nbPassagerMax = nbPassagerMax;
    }

    public int getPrixJour() {
        return this.prixJour;
    }

    public void setPrixJour(int prixJour) {
        this.prixJour = prixJour;
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getNbLocation() {
        return this.nbLocation;
    }

    public void setNbLocation(int nbLocation) {
        this.nbLocation = nbLocation;
    }

    public boolean isStatut() {
        return this.statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }  

    public String getNom() {
        return this.type;
    }

    public void setNom(String nom) {
        this.type = nom;
    }
    
    
    
}
