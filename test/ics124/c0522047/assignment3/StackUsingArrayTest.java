package ics124.c0522047.assignment3;

import ics124.assignment3.StackOverflowException;
import ics124.assignment3.StackUnderflowException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author C0522047
 */
public class StackUsingArrayTest {
    
    public StackUsingArrayTest() {
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
    public void teardown(){
    }
    /**
     * Test of isEmpty method, of class StackUsingArray.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        StackUsingArray stack = new StackUsingArray();
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    /**
     * Test of isFull method, of class StackUsingArray.
     */
    @Test
    public void testIsFull() {
        System.out.println("push");
        StackUsingArray stack = new StackUsingArray();
        stack.push(12);
        stack.push(42);
        
        //check if stack is full
        assertFalse(stack.isFull());
        
        stack.push(3);
        stack.push(3);
        //Stack is now full
        assertTrue(stack.isFull());
    }

    /**
     * Test of peek method, of class StackUsingArray.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackUsingArray stack = new StackUsingArray();

        //Peek at empty
        assertThrows(StackUnderflowException.class, () -> stack.peek());

        stack.push(42);
        //Peek with value
        assertEquals(Integer.valueOf(42), stack.peek());
    }

    /**
     * Test of pop method, of class StackUsingArray.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackUsingArray stack = new StackUsingArray();

        assertThrows(StackUnderflowException.class, () -> stack.pop());

        stack.push(10);
        stack.push(20);

        assertEquals(Integer.valueOf(20), stack.pop()); 
        assertEquals(Integer.valueOf(10), stack.pop()); 
        assertTrue(stack.isEmpty()); 
        }

    /**
     * Test of push method, of class StackUsingArray.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        StackUsingArray stack = new StackUsingArray();
        stack.push(12);
        stack.push(42);
        stack.push(3);
        stack.push(6);
        assertThrows(StackOverflowException.class, () -> stack.push(9));
    }
}
