package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Zaeem Petersen - 219010145
 */
public class programTest {
    private program App1;
    private program App2;
    private program App3;
    
    public programTest() {         
    }

    @BeforeEach
    public void setUp() {
        App1 = new program();
        App2 = new program();
        App3 = new program();
        App3 = App1;
    }
    
    @AfterEach
    public void tearDown() {
    }

    //Test Identity
    @Test
    public void testIdentity(){
        assertSame(App1,App3);
    }
    
    //Test Equality
    @Test
    public void testEquality(){
        assertEquals(App1,App3);
    }
    
    //Failing Test
    @Test
    public void onError(){
        assertEquals(App1,App3);
        fail("Fail test");
    }
    
    //Timeout
    @Timeout (1)
    @Test
    public void testWithTimeout(){
       for (int i=0;i<100000;i++)
       {
           System.out.println(i);
       }
    }
    
    //Disabling a Test
    @Disabled
    @Test
    public void temporaryDisabledTest()
    {
       assertEquals(App1,App3); 
    }
    
    
}
