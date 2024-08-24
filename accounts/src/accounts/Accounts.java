
package accounts;
import java.util.Scanner;
/**
 *
 * @author Ahsan
 */

class userAccounts{
    private double balance;
    
    public userAccounts()
    {
        this.balance=1000;
    }
    
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    
    public void credit(double creditBalance)
    {
       this.balance+=creditBalance;
    }
    
    public void debit()
    {
        Scanner userInput = new Scanner(System.in);
        
        double debitBalance;
        System.out.println("Enter the amount you wanna withdraw:");
        debitBalance=userInput.nextDouble();
        if(debitBalance <= this.balance){
            this.balance-=debitBalance;
            System.out.println("<---Transaction Successfull--->");
        }else{
            System.out.println("“Debit amount exceeded account balance");
            this.balance = this.balance-15;
        }
        
    }
}

public class Accounts {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Section: BS-SE 4-B ");
        System.out.println("Arid No.: 21-Arid-737");
        System.out.println("Submitted to : Ma'am Aiman Khan ");
        
        userAccounts accountOne= new userAccounts();
        
        accountOne.setBalance(20000);
        
        accountOne.credit(10000);
        
        accountOne.debit();        
        System.out.println("Your current balance is -->" + accountOne.getBalance());
        
        accountOne.debit();        
        System.out.println("Your current balance is -->" + accountOne.getBalance());
    }
}
