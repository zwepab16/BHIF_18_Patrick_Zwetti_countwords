

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zwetti Patrick
 */
public class BookTest {
    
    public BookTest() {
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
     * Test of countW method, of class Book.
     */
    @Test
    public void testCountW() {
        System.out.println("countW");
        Book instance = new Book("buch1", "Hallo;:,.*+#* Mama -+/,Hallo! __Thomas%/$$ Hallo ");
        HashMap<String, Integer> expResult =new HashMap<>();
        expResult.put("Mama", 1);
        expResult.put("Hallo", 3);
        expResult.put("Thomas", 1);
        HashMap<String, Integer> result = instance.countW();
        System.out.println(result);
        assertEquals(expResult, result);
     
      
    }
    
}
