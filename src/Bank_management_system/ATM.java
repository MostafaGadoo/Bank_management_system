/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author agh
 */

    public class ATM {
    private String location;
    private int ATM_id;
    private double ATM_balance;
    private EmployeeAccount AccountBalance;
private Client Balance;
    

    public ATM(String location, int ATM_id, double ATM_balance, String address) {
        this.location = location;
        this.ATM_balance = ATM_balance;
        this.ATM_id =ATM_id;
    }

    public double getATM_balance() {
        return ATM_balance;
    }

    public void setATM_balance(double ATM_balance) {
        this.ATM_balance = ATM_balance;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getATM_id() {
        return ATM_id;
    }

    public void setATM_id(int ATM_id) {
        this.ATM_id = ATM_id;
    }

    public EmployeeAccount getBalance() {
        return AccountBalance;
    }
    
   
    void withdraw(double amount){
        double accountBalance = AccountBalance.getBalance();
        if (amount<=ATM_balance){
            if(accountBalance >= amount){
            ATM_balance -= amount;
            accountBalance -= amount;
            }
        }
    }
    
    void deposit(double amount){
    double accountBalance =AccountBalance.getBalance();
            ATM_balance += amount;
            accountBalance += amount;
        
    }
}

