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
    

    public ClinetControl(String username, String password, String DOB, String AccountType, double balance) {
        super(username, password, DOB, AccountType, balance);
    }

   
    
    
    public void createAccount(String username, String password, String DOB, String AccountType, double balance) {
            Client clientUser = new Client(username,password, DOB, AccountType,balance);
            Client.add(clientUser);
            System.out.println("Client account has been successfully created");
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
}
