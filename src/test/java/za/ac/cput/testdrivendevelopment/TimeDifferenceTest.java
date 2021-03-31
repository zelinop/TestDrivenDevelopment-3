/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mogamad Taariq Phillips - 220166153
 */
public class TimeDifferenceTest {
    
    private TimeDifference TD1;
    private TimeDifference TD2;
    private TimeDifference TD3;
    private TimeDifference TD4;
    
    public TimeDifferenceTest() {
    }

    @BeforeEach
    public void setUp() 
    {
        this.TD1 = new TimeDifference(01,10,01);
        this.TD2 = new TimeDifference(02,20,02);
          this.TD3 = TD1;
          this.TD4 = TD2;
    }
    
    @Test
    public void testIdentity(){
        assertSame(TD1,TD3);
    }
        
    @Test
    public void testEquality(){
        assertEquals(TD1, TD3);
    }
    
    @Test
    public void testFail() {
        assertSame(TD1,TD4);
     fail("the test fails");
    }
    
    @Timeout (1000)
    @Test 
    public void testWithTimeout( ) {
           for (int i = 0; i < 5; i++) {
           System.out.println(i);
    }
    }
   
    @Disabled
    @Test
    public void testdisable(){
        assertSame(TD1,TD4);
    }
    
}
