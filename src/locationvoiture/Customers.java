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
public class Customers {
    // Propriétés
    protected String nom, prenom;
    protected int age, noPermis;
    
    // Constructeur avec arguments
     public Customers(String nom, String prenom, int age, int noPermis) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.noPermis = noPermis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoPermis() {
        return noPermis;
    }

    public void setNoPermis(int noPermis) {
        this.noPermis = noPermis;
    }
    
    
    
}
