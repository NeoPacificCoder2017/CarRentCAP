/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationvoiture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eleve9
 */
public class LocationVoiture {
  
  private static final Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

  ArrayList<Customers> customer = new ArrayList<Customers>();

  }

  //////////////////////////////Function print///////////////////////////////////////

  public static void println(Object a){
      System.out.println(a);
  }

  public static void print(Object a){
      System.out.print(a);
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
    
}

