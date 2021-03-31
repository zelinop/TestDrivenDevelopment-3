/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
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
        int result = app1.addition(3,5);
        assertEquals(10, result);
    }
     @Test
    public void testSubtraction(){
        int result = app2.subtract(3,5);
        assertSame(8, result);
    }
    
   @Test
   public void testDivide(){
       int results = app3.divide(16, 2);
       assertSame(app1,results);
   }
   @Disabled
    @Test
   public void testDivi(){
       int results = app3.divide(16, 2);
       assertSame(app1,results);
   }
    
}
