/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

import java.util.ArrayList;

/**
 *
 * @author agh
 */

public class Client {
    String username;
    String password;
    String DOB;
    String AccountType;
    double balance;
    static int clientID;
    ArrayList <Client> Client;

    public Client(String username, String password, String DOB, String AccountType, double balance) {
        this.username = username;
        this.password = password;
        this.DOB = DOB;
        this.AccountType = AccountType;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Client> getClient() {
        return Client;
    }

    public void setClient(ArrayList<Client> Client) {
        this.Client = Client;
    }
   
   public Client login (String name, String pass)
    {
        Client cust = null;
        for (int i=0; i<Client.size(); i++)
        { 
            cust = (Client) Client.get(i);
            if (cust.getUsername().equals(name) && cust.getPassword().equals(pass))
                return cust;
        }
        return null;
    }
      
   void Amount_withDraw(double amount){
        if (balance >= amount){
        balance -=amount;
        }
        else {
            System.out.println("The balance in the account is less then the amount you want to withdraw");
        }
   }
   void Amount_deposit(double amount){
     balance += amount;
   }
    
}

