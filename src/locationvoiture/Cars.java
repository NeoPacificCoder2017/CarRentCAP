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
    
    protected int noImma, nbPassagerMax, prixJour, km, nbLocation;
    protected boolean statut;

    public Cars(int noImma, int nbPassagerMax, int prixJour, int km, int nbLocation, boolean statut) {
        this.noImma = noImma;
        this.nbPassagerMax = nbPassagerMax;
        this.prixJour = prixJour;
        this.km = km;
        this.nbLocation = nbLocation;
        this.statut = statut;
    }

    public int getNoImma() {
        return noImma;
    }

    public void setNoImma(int noImma) {
        this.noImma = noImma;
    }

    public int getNbPassagerMax() {
        return nbPassagerMax;
    }

    public void setNbPassagerMax(int nbPassagerMax) {
        this.nbPassagerMax = nbPassagerMax;
    }

    public int getPrixJour() {
        return prixJour;
    }

    public void setPrixJour(int prixJour) {
        this.prixJour = prixJour;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getNbLocation() {
        return nbLocation;
    }

    public void setNbLocation(int nbLocation) {
        this.nbLocation = nbLocation;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }
    
    
    
}
