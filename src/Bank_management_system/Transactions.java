/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_management_system;

/**
 *
 * @author Mostafa Gado
 */
public class Transactions extends Account{
    private String data;
    private int TransactionID;
    private String type;
    private int TransactionAmount;
    private double amount;

    public Transactions(String data, int TransactionID, String type,int TransactionAmount,double amount) {
        this.data = data;
        this.TransactionID = TransactionID;
        this.type = type;
        this.TransactionAmount = TransactionAmount;
        this.amount = amount;
    }
    
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    void TransferMoney(){}
    
    void withDraw(double amount){
    if (amount<balance)            
            balance -= amount;
    }
    void Depsit (double amount){
     balance += amount;
    }
    
}
