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

public class Bank{
    String address;
    int code;
    
    public String getAddress() {
        return address;
    }

    public Bank(String address, int code) {
        this.address = address;
        this.code = code;
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
}

