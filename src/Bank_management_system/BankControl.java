/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mostafa Gado
 */
public class BankControl extends Account{
    
     Account accountUser;
    ArrayList <Account> account;

    public BankControl(String userName, String password, String AccountType, double balance) {
        super(userName, password, AccountType, balance);
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
    
//    public Account updateAccount (int accountID){
//    for (int i =0; i <= account.size();i++){
//        if (accountID == accountUser.getAccountID())
//            System.out.println("Please enter what you need to update");
//            Scanner update = new Scanner(System.in);
//            int Updated = update.nextInt();
//            
//        }   
//        return null;
//    }
    
    
}
