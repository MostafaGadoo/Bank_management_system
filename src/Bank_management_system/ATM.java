/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

/**
 *
 * @author Mostafa Gado
 */
public class ATM {
    private String location;
    private String managedBy;
    private double Abalance;

    public double getAbalance() {
        return Abalance;
    }

    public void setAbalance(double Abalance) {
        this.Abalance = Abalance;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManagedBy() {
        return managedBy;
    }

    public void setManagedBy(String managedBy) {
        this.managedBy = managedBy;
    }
    
    double checkBalance(){
        
        if (balance <= Abalance)
            
        return 0;
    }
    
    
    void Transactions(){
    
    }
}
