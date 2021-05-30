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
ArrayList<Client> customers;
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
      
      void manages(){}
}

