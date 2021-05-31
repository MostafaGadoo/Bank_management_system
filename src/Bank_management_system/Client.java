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
   int pin;
   int cardNo;
ArrayList<Client> Client;
   

    public Client(String username, String password, String DOB, int pin, int cardNo, ArrayList<Client> Client) {
        this.username = username;
        this.password = password;
        this.DOB = DOB;
        this.pin = pin;
        this.cardNo = cardNo;
        this.Client = Client;
    }

 

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
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
      
    
}

