/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationvoiture;

/**
 *
 * @author eleve2
 */
public class Rent {
    
    private static int COUNT = 1;
    
    private int code;
    private Cars car;
    private Customers customer;
    private int period;
    private int cost;

    public Rent(Cars car, Customers customer, int period) {
        
        this.code = COUNT++;
        this.car = car;
        this.customer = customer;
        this.period = period;
        this.cost = this.car.prixJour * this.period;
        
    }
    
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int value) {
        this.code = value;
    }
    
    public Cars getCar() {
        return this.car;
    }
    
    public void setCar(Cars newCar) {
        this.car = newCar;
    }
    
    public Customers getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customers newCustomer) {
        this.customer = newCustomer;
    }
    
    public int getPeriod() {
        return this.period;
    }
    
    public void setPeriod(int value) {
        this.period = value;
    }
    
    public int getCost() {
        return this.cost;
    }
    
}
