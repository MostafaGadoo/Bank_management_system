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
public class ClinetControl extends Client {

    Client clientUser;
    ArrayList <Client> Client;
    ATM atm;
    

    public ClinetControl(String username, String password, String DOB, String AccountType, double balance) {
        super(username, password, DOB, AccountType, balance);
    }
    
    public void verifyAccount(String username, String password, String DOB, String AccountType, double balance) {
           clientUser.createAccount(username, password, DOB, AccountType, balance);
        }
    
    public void changePassword(String Newpassword){
    clientUser.setPassword(Newpassword);
    }
    
    public double viewBalance (){
    return clientUser.getBalance();
    }
    
    public void updateBalance(double updatedBalace){
    clientUser.setBalance(updatedBalace);
    }
    
     public void transferTo(Client A1,Client A2, double x) {
    if (x <= balance) {
        A1.Amount_withDraw(x);
        A2.Amount_deposit(x);
        System.out.println("\nTransfer succesful. Tansfered: $" + A1.getBalance());
    } else if (x > balance) {
        System.out.println("\nTransfer failed, not enough balance!");
    }
    }
     
     void clinet_showLogin(String userName, String password){
     clientUser.client_login(userName, password);
     }
     
}
