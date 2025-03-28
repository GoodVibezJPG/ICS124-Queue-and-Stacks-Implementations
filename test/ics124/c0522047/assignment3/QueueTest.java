/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ics124.c0522047.assignment3;

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
public class QueueTest {
    
    public QueueTest() {
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
     * Test of add method, of class Queue.
     */
    @Test
    public void testAdd() {
        Queue queue = new Queue();
        assertTrue(queue.add(10));
        assertEquals(10, (int) queue.element());
    }

    /**
     * Test of element method, of class Queue.
     */
    @Test
    public void testElement() {
        System.out.println("element");
        Queue instance = new Queue();
        Object expResult = null;
        Object result = instance.element();
        assertEquals(expResult, result);

    }

    /**
     * Test of offer method, of class Queue.
     */
    @Test
    public void testOffer() {
        Queue queue = new Queue();
        assertTrue(queue.offer(20));
        assertEquals(20, (int) queue.element());
    }

    /**
     * Test of peek method, of class Queue.
     */
    @Test
    public void testPeek() {
        Queue queue = new Queue();
        //Test peeking at empty queue
        assertNull(queue.peek());
        
        queue.add(30);
        assertEquals(30, (int) queue.peek());
    }

    /**
     * Test of poll method, of class Queue.
     */
    @Test
    public void testPoll() {
        Queue queue = new Queue();
        queue.add(40);
        //Return 40
        assertEquals(40, (int) queue.poll());
        //Return null once empty
        assertNull(queue.poll());
    }

    /**
     * Test of remove method, of class Queue.
     */
    @Test
    public void testRemove() {
        Queue queue = new Queue();
        assertTrue(queue.add(12));
        assertEquals(12, (int) queue.remove());
        assertThrows(IllegalStateException.class, () -> queue.remove());
    }   
}
