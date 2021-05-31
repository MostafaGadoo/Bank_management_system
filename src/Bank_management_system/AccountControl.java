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
public class AccountControl extends Account {

    Account accountUser;
    ArrayList <Account> account;
    
    public AccountControl(String userName,String password,String AccountType, double balance) {
        super(userName,password, AccountType, balance);
    }
    
    public void createAccount(String userName,String password,String AccountType, double balance) {
      
            Account AccountUser = new Account(userName,password, AccountType, balance);
            accountUser.setAccountType(AccountType);
            account.add(AccountUser);
            System.out.println("Admin user has been created successfully");
        }
    
    public boolean searchAcount(int acountID){
        for (int i =0; i < account.size();i++){
            if(accountID== accountUser.getAccountID()){
                System.out.println("The account is found");
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
        
    
    public Account deleteAccount(int accountID){
    for (int i =0; i <= account.size();i++){
        if (accountID == accountUser.getAccountID())
        return account.remove(accountID);
        }   
        return null;
    }
    
    public void changePassword(String Newpassword){
    accountUser.setPassword(Newpassword);
    }
}
