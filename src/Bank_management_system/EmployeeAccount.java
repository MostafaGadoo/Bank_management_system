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
public class EmployeeAccount {
    String AccountType;
    double balance;
    private String userName;
    private String password;
    static int accountID;
    private int DOB;
    ArrayList<EmployeeAccount> Employee;
    
    public EmployeeAccount(String userName, String password,String AccountType, double balance,int DOB) {
        this.AccountType = AccountType;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.DOB = DOB;
    }

   


    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getAccountID() {
        return accountID;
    }

    public static void setAccountID(int accountID) {
        EmployeeAccount.accountID = accountID;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public ArrayList<EmployeeAccount> getEmployee() {
        return Employee;
    }

    public void setEmployee(ArrayList<EmployeeAccount> Employee) {
        this.Employee = Employee;
    }
    
    public EmployeeAccount login (String name, String pass)
    {
        EmployeeAccount cust  = null;
        for (int i=0; i<Employee.size(); i++)
        { 
            cust = (EmployeeAccount) Employee.get(i);
            if (cust.getUserName().equals(name) && cust.getPassword().equals(pass))
                return cust;
        }
        return null;
    }
   
}

