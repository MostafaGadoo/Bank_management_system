/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

import java.util.ArrayList;

/**
 *
 * @author Mostafa Gado
 */
public class ATM extends Bank{
    private String location;
    private String managedBy;
    private double Abalance;
    private Account Balance;
    Transactions transaction;

    public ATM(String address, int code, ArrayList<Client> customers) {
        super(address, code, customers);
    }

    public ATM(String location, String managedBy, double Abalance, Account Balance, Transactions transaction, String address, int code, ArrayList<Client> customers) {
        super(address, code, customers);
        this.location = location;
        this.managedBy = managedBy;
        this.Abalance = Abalance;
        this.Balance = Balance;
        this.transaction = transaction;
    }
    
    

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
    
    boolean checkBalance(){
        
        if (Balance.getBalance() <= Abalance)
        return true;
        else
        return false;
    }
    
    
    void Transactions(double amount){
    if (checkBalance() == true){
        transaction.withDraw(amount);
        System.out.println("Transaction success");
        Abalance -= amount;
    }else
            System.out.println("The amount in the ATM is less than tha amount needed");
    }
}
