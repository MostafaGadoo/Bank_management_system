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
public class ATM {
    private String location;
    private int ATM_id;
    private double ATM_balance;
    private EmployeeAccount Employee_AccountBalance;
    private Client Client_AccountBalance;
    

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
        return Employee_AccountBalance;
    }
    
    boolean checkBalance(double amount){
        if (amount<= ATM_balance)
        return true;
        else
        return false;
    }
  
    void Employee_withdraw(double amount){
        double accountBalance = Employee_AccountBalance.getBalance();
        if (checkBalance(amount) == true){
            if(accountBalance >= amount){
            ATM_balance -= amount;
            accountBalance -= amount;
            }else {
                System.out.println("No enough money in the ATM");
            }
        }
    }
    
    void Employee_deposit(double amount){
    double accountBalance =Employee_AccountBalance.getBalance();
            ATM_balance -= amount;
            accountBalance += amount;
            System.out.println("Thank you for the transaction");
    }
    
    void Client_withdraw(double amount){
        double accountBalance = Client_AccountBalance.getBalance();
        if (checkBalance(amount) == true){
            if(accountBalance >= amount){
            ATM_balance -= amount;
            accountBalance -= amount;
            }else {
                System.out.println("No enough money in the ATM");
            }
        }
    }
    void Client_deposit(double amount){
    double accountBalance = Client_AccountBalance.getBalance();
            ATM_balance -= amount;
            accountBalance += amount;
            System.out.println("Thank you for the transaction");
    }
    
    
}
