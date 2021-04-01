/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Aristoteles 218290276
 */
public class calculatorTest {
    private calculator app1;
    private calculator app2;
    private calculator app3;
    public calculatorTest() {
    }
    

    @BeforeEach
    public void setUp() {
        this.app1 = new calculator();
        this.app2 = new calculator();
          this.app3 = app1;
         
    }
    @Test
    public void testIdentity(){
        assertSame(app1,app3);
    }
        @Test
    public void testEquality(){
        
        assertEquals(app1, app3); 
        
    }
   
   
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
     fail("the test caswe is a fail");
    }
    @Test
    public void testAddition(){
        int result = app1.addition(5,5);
        assertEquals(10, result);
    }
     @Test
    public void testSubtraction(){
        int result = app2.subtract(5,3);
        assertSame(2, result);
    }
    
   @Test
   public void testDivide(){
       int results = app3.divide(50,5);
       assertSame(app1,app3);
   }
   @Disabled
    @Test
   public void testDiv(){
       int results = app3.divide(100, 2);
       assertSame(50,results);
   }
   
     
    @Timeout (2)
    @Test
    public void testWithTimeout(){
       for (int i=0;i<10000;i++)
       {
           System.out.println(i);
       }
    }
    
      
}