/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistchallenge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1401315
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of count method, of class BankAccount.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        BankAccount instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getaccountNumber method, of class BankAccount.
     */
    @Test
    public void testGetaccountNumber() {
        System.out.println("getaccountNumber");
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.getaccountNumber();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsortCode method, of class BankAccount.
     */
    @Test
    public void testGetsortCode() {
        System.out.println("getsortCode");
        BankAccount instance = null;
        String expResult = "";
        String result = instance.getsortCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lohiBalance method, of class BankAccount.
     */
    @Test
    public void testLohiBalance() {
        System.out.println("lohiBalance");
        BankAccount instance = null;
        int expResult = 0;
        int result = instance.lohiBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class BankAccount.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        int accountNum = 0;
        String sortCode = "";
        double balance = 0.0;
        BankAccount instance = null;
        instance.display(accountNum, sortCode, balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 
     @Test
    public void testSetBalance() {
        //  public BankAccount(int accountNumber, String sortCode, double balance) 
        System.out.println("setBalance");
        double expResult = 125;
        double result = 0 ;
        //double balance = 0.0;
        BankAccount instance = new BankAccount(1, "44-44-44", 0.0);  // construct
        result = instance.setBalance(125.00);
        assertEquals(expResult, result, 0.0);        
       
    }   
    
}
