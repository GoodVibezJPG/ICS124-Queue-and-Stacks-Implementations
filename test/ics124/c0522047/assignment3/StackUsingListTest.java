/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.c0522047.assignment3;

import ics124.assignment3.StackUnderflowException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kale
 */
public class StackUsingListTest {
    
    public StackUsingListTest() {
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
     * Test of isEmpty method, of class StackUsingList.
     */
    @Test
    public void testIsEmpty() {
        StackUsingList list = new StackUsingList();
        assertTrue(list.isEmpty()); 

        list.push(10);
        assertFalse(list.isEmpty()); 

        list.pop();
        assertTrue(list.isEmpty()); 
    }

    /**
     * Test of isFull method, of class StackUsingList.
     * This will always be false, since our SLL cannot be full
     */
    @Test
    public void testIsFull() {
        StackUsingList list = new StackUsingList();
        assertFalse(list.isFull()); 

        list.push(10);
        list.push(20);
        assertFalse(list.isFull()); 
    }

    /**
     * Test of peek method, of class StackUsingList.
     */
    @Test
    public void testPeek() {
        StackUsingList list = new StackUsingList();
        
        // Test peeking an empty stack (should throw an exception)
        assertThrows(StackUnderflowException.class, () -> list.peek());

        list.push(10);
        assertEquals(Integer.valueOf(10), list.peek());

        list.push(20);
        assertEquals(Integer.valueOf(20), list.peek()); 
    }

    /**
     * Test of pop method, of class StackUsingList.
     */
    @Test
    public void testPop() {
        StackUsingList list = new StackUsingList();

        // Test popping an empty stack 
        assertThrows(StackUnderflowException.class, () -> list.pop());


        list.push(10);
        list.push(20);
        list.push(30); 

        assertEquals(Integer.valueOf(30), list.pop()); 
        assertEquals(Integer.valueOf(20), list.pop()); 
        assertEquals(Integer.valueOf(10), list.pop()); 

        assertTrue(list.isEmpty()); 
    }

    /**
     * Test of push method, of class StackUsingList.
     */
    @Test
    public void testPush() {
        StackUsingList list = new StackUsingList();
        
        
        list.push(10);
        assertEquals(Integer.valueOf(10), list.peek()); 

        list.push(20);
        assertEquals(Integer.valueOf(20), list.peek()); 

        list.push(30);
        assertEquals(Integer.valueOf(30), list.peek()); 
    }
}