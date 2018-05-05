/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationvoiture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eleve6
 */
public class SQLRules {
  
  public static void sauverEnBase(String lastname, String firstname, int age, int NumLicence) throws SQLException{
    //Information sur la base de données
    String url = "jdbc:mysql://localhost/testjava";
    String driver = "";
    String login = "root";
    String passwd = "";
    Connection cn =null;
    Statement st =null;
    
    try{
      //Chargement du Driver
      System.out.println("Connexion à la base de données...");
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("OK");
      //Récupération de la connexion
      cn = (Connection) DriverManager.getConnection(url, login, passwd);
      System.out.println("Connexion réussi!");
      //Création d'un statement
      st = (Statement) cn.createStatement();
      System.out.println("Objet requêt crée!");
      String sql = "INSERT INTO `customers`(`lastname`, `firstname`, `number`) VALUES ('"+lastname+"', '"+firstname+"', "+age+", "+NumLicence+")";
      //Execute la requête
      st.execute(sql);
      System.out.println("Requête réussi!");
    }catch (SQLException e){
      e.printStackTrace();
    } 
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    }finally{
      try{//Libérer ressources de la mémoire
        
        st.close();
        cn.close();
      }catch (SQLException e){
        e.printStackTrace();
      }
    }
  }
  
  public static void lireEnBase() throws SQLException{
    //information d'accés à la base de données
    String url = "jdbc:mysql://localhost/testjava";
    String driver = "com.mysql.jdbc.Driver";
    String login = "root";
    String passwd = "";
    Connection cn =null;Statement st =null;ResultSet rs =null;
    try{
      //Chargement du driver
      System.out.print("Chargement du driver... ");
      Class.forName(driver);
      System.out.println("OK");
      //Récupération de la connexion
      System.out.print("Connexion à la base de données... ");
      cn = (Connection) DriverManager.getConnection(url, login, passwd);
      System.out.println("OK");
      System.out.println("Connexion réussi!");
      //Création d'un statement
      st = (Statement) cn.createStatement();
      String sql = "SELECT * FROM `customers`";
      //(parcourir Resultset)
      rs = st.executeQuery(sql);
      while(rs.next()){
       System.out.println(rs.getString("lastname" + " "));
       System.out.println(rs.getString("firstname" + " "));
       System.out.println(rs.getInt("age"));
       System.out.println(rs.getInt("Numlicence"));
      }
    }catch (SQLException e){
    } 
    catch (ClassNotFoundException e) {
    }finally{
      try{//Libérer ressources de la mémoire
        cn.close();
        st.close();
      }catch (SQLException e){
      }
    }
  }
  
  public static void lireEnBaseById(int id) throws SQLException{
    //information d'accés à la base de données
    String url = "jdbc:mysql://localhost/testjava";
    String login = "root";
    String passwd = "";
    Connection cn =null;Statement st =null;ResultSet rs =null;
    
    try{
      //Chargement du driver
      System.out.print("Chargement du driver... ");
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("OK");
      //Récupération de la connexion
      System.out.print("Connexion à la base de données... ");
      cn = (Connection) DriverManager.getConnection(url, login, passwd);
      System.out.println("OK");
      System.out.println("Connexion réussi !");
      //Création d'un statement
      st = (Statement) cn.createStatement();
      String sql = "SELECT `id`, `lastname`, `firstname` FROM `personne` where `id`= " + id + " ";
      //(parcourir Resultset)
      rs = st.executeQuery(sql);
      
      while(rs.next()){
       System.out.print(rs.getInt("id"));
       System.out.print(rs.getString("lastname"));
       System.out.print(rs.getString("firstname"));
      }
      
    }catch (SQLException e){
    }catch (ClassNotFoundException e) {
    }finally{
      try{//Libérer ressources de la mémoire
        cn.close();
        st.close();
      }catch (SQLException e){
      }
    }
  }
}

