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
public class EmployeeControl extends EmployeeAccount{
    
     EmployeeAccount accountUser;
    ArrayList <EmployeeAccount> account;
    

    public EmployeeControl(String userName, String password, String AccountType, double balance, String DOB) {
        super(userName, password, AccountType, balance, DOB);
    }

    
    public void verifyAccount(String userName, String password,String AccountType, double balance,String DOB) {
         accountUser.Employee_createAccount(userName, password, AccountType, balance, DOB);
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
        
    
    public EmployeeAccount deleteAccount(int accountID){
    for (int i =0; i <= account.size();i++){
        if (accountID == accountUser.getAccountID())
        return account.remove(accountID);
        }   
        return null;
    }
    
    void Employee_showLogin(String username,String password){
    accountUser.Employee_login(username, password);
    }
    
    
}
