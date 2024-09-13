package org.example.e172;
class Customer{
    private String accountNumber;
    private String fullName;
    private String email;
    private double balance;
//Constructor
    public Customer(String accountNumber, String fullName, String email, double balance){
        this.accountNumber=accountNumber;
        this.fullName=fullName;
        this.email=email;
        this.balance=balance;
    }

    //Setter
public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
}
public void setfullName(String fullName){
   this.fullName=fullName;

}
public void setEmail(String email){
this.email=email;
    }
public void setBalance(double balance){
  this.balance=balance;
}


//getter
    public String getAccountNumber(){
    return accountNumber;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public double getBalance(){
        return balance;
    }

public void displayPrint(){
      System.out.println("Account Number: "+accountNumber);
    System.out.println("Full Name: "+fullName);
    System.out.println("Email: "+email);
    System.out.println("Account Balance: "+balance);

}}
public class E172Encapsulation {
    public static void main(String[] args){
        Customer customer = new Customer("1234567890", "Sarah Connor", "sarah.connor@example.com", 15000.0);
customer.displayPrint();
    //    System.out.println("Account Number: "+customer);
    }

}


