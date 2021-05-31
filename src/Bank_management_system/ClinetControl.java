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
public class ClinetControl extends Account {

    Account accountUser;
    ArrayList <Account> account;
    
    public ClinetControl(String userName,String password,String AccountType, double balance) {
        super(userName,password, AccountType, balance);
    }
    
    public void createAccount(String userName,String password,String AccountType, double balance) {
      
            Account AccountUser = new Account(userName,password, AccountType, balance);
            accountUser.setAccountType(AccountType);
            account.add(AccountUser);
            System.out.println("Admin user has been created successfully");
        }
    
    public void changePassword(String Newpassword){
    accountUser.setPassword(Newpassword);
    }
    
    public double viewBalance (){
    return accountUser.getBalance();
    }
    
    public void updateBalance(double updatedBalace){
    accountUser.setBalance(updatedBalace);
    }
}
