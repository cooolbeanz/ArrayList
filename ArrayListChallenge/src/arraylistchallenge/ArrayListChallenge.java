/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistchallenge;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author 1401315
 */
public class ArrayListChallenge {
    
    public static void main(String[] args) {
       
       ArrayList<BankAccount> ledger = new ArrayList<>();
        
       String sortCode1 = "11-22-33";
       String sortCode2 = "22-33-44";
       String sortCode3 = "44-55-66";
       
       int accountNumber = 0;
       double balance = 0;  
       
       Random randomGenerator = new Random();
       
       for (int i=0; i <= 60; i++)
       {
            int randomInt = randomGenerator.nextInt();
            int accountNumber = (int) Random(8);
            String sortCode = (int) Random(2) + "-" + (int) Random(2) + "-" + (int)Random(2);
            double balance = randomBetween(0, 100000);
            BankAccount b = new BankAccount(accountNumber, sortCode, balance);
            
            ledger.add(b);
         
        }
         
   }
    
}
