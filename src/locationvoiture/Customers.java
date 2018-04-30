package locationvoiture;


public class Customers {
    // Propriétés
    protected String lastname;
    protected String firstname;
    protected int age;
    protected int numberLicence;
    
    // Constructeur avec arguments
     public Customers(String lastname, String firstname, int age, int numberLicence) {
       this.lastname = lastname;
       this.firstname = firstname;
       this.age = age;
       this.numberLicence = numberLicence;
    }
     
     //Accesseurs 
     public String getLastname(){
       return this.lastname;
     }
     
     public void setLastname(String lastname ){
       this.lastname = lastname;
     }
     
     public String getFirstname(){
       return this.firstname;
     }
     
     public void setFirstname(String firstname ){
       this.firstname = firstname;
     }
     
     public int getAge(){
       return this.age;
     }
     
     public void setage(int age ){
       this.age = age;
     }
     
     public int getNumLicence(){
       return this.numberLicence;
     }
     
     public void setNumberLicence(int numberLicence ){
       this.numberLicence = numberLicence;
     }
     
     //Fonction qui seras appeler dans le "Main"
    
}
