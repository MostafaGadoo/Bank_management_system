/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

/**
 *
 * @author agh
 */
import java.util.ArrayList;
public class Bank{
    String address;
    int code;
    Account accountUser;
    ArrayList<Client> customers;
    ArrayList <Account> account;
    public String getAddress() {
        return address;
    }

    public Bank(String address, int code, ArrayList<Client> customers) {
        this.address = address;
        this.code = code;
        this.customers = customers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
      public Client login (String name, String pass)
    {
        Client cust = null;
        for (int i=0; i<customers.size(); i++)
        { 
            cust = (Client) customers.get(i);
            if (cust.getUsername().equals(name) && cust.getPassword().equals(pass))
                return cust;
        }
        return null;
    }
      
      public void createAccount(int AccountNo, String AccountType, double balance, Client owner,Account accountType) {
      
            Account AccountUser = new Account(AccountNo, AccountType, balance, owner);
            accountUser.setAccountType(AccountType);
            account.add(AccountUser);
            System.out.println("Admin user has been created successfully");
        }
      
      
}

