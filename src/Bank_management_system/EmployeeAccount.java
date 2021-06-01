/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

import java.util.ArrayList;
//import java.sql;

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
    private String DOB;
    ArrayList<EmployeeAccount> Employee; // the employees are added manualy by the system admins
    
    
    public EmployeeAccount(String userName, String password,String AccountType, double balance,String DOB) {
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public ArrayList<EmployeeAccount> getEmployee() {
        return Employee;
    }

    public void setEmployee(ArrayList<EmployeeAccount> Employee) {
        this.Employee = Employee;
    }
    
    public EmployeeAccount Employee_login (String name, String pass)
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
   
    public void Employee_createAccount(String userName, String password,String AccountType, double balance,String DOB) {
        try{
        EmployeeAccount accountUser = new EmployeeAccount(userName,password,AccountType,balance,DOB);
            Employee.add(accountUser);
            System.out.println("Employee account has been successfully created");
                } catch(Exception Error){System.out.println("Thank You");}
        
        
        
        }
}

