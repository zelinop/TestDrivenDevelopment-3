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
 * @author Ziyaad Petersen- 219083479
 */
public class StoreTest {
//declaring variables
    private int store1;
    private String store2;
    private int store3;
    private int store4;

    public StoreTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }
//assigning variables before each test
    @BeforeEach
    public void setUp() {
        store1 = 5;
        store2 = "5";
        store3 = store1;
        store4 = store3;
    }

    @AfterEach
    public void tearDown() {
    }

//testing equility
    @Test
    public void testEquility() {
        assertEquals(store1, store3,store4);
        /** Khanyisele added this code to Ziyaad's code
         *System.out.prinltn("test equility is complete");
         */
    }
    //testing identity
    @Test
    public void testIdentity() {
        assertSame(store1,store3);
         /** Khanyisele added this code to Ziyaad's code
         System.out.prinltn("test identity is complete");
         */
        
    }
    
    //fail testing
    @Test
    public void testFail() {
        assertSame(store1,store2);
        System.out.println("this test fails");
    }
    //testing timeout
    @Timeout(1)
    @Test
    public void testWithTimeout() {
     for (int j=0; j<100000; j++) {
         System.out.println(j);
     }

    }
    //disabled testing
    @Disabled
    @Test
    public void testDisable() {
        assertEquals(store1, store2);
    }

    

}
