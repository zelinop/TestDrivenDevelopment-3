
package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
        
/**
 *
 * @author Zelino 218325991
 */
public class AddTwoNumbersTest {
    
    public AddTwoNumbersTest () {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    //Test for Equality
    @Test
    public void testEquality () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 5));
    
    }
    //Test Identity
    @Test
    public void testIdentity (){
   
        AddTwoNumbers atn = new AddTwoNumbers (){};
        
        assertSame(10, atn.abc(5, 5));
    }
        
    //Failing test
    @Test
    public void testFailing () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 4));
    
    }
    //Timeout test for 5 seconds
    @Timeout (5)
    @Test
    public void testTimeout () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 5));
    
    }
 
    //Disabling the test
    @Disabled
    @Test
    public void testDisabled () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 5));
    
    }
}