package ics124.c0522047.assignment3;

import ics124.assignment3.Ics124Stack;
import ics124.assignment3.StackOverflowException;
import ics124.assignment3.StackUnderflowException;

/**
 *
 * @author C0522047 | Caleb Irvine
 */
public class StackUsingList implements Ics124Stack {
    
    private Ics124SinglyLinkedList<Integer> data;
    private int size;

    

    public StackUsingList() {
        this.data = new Ics124SinglyLinkedList<>();
    }
    
    public StackUsingList(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Stack size must be greater than 0");
        }
        this.size = size;
        this.data = new Ics124SinglyLinkedList<>();
    }
    
    
    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Integer peek() {
        if (isEmpty()){
            throw new StackUnderflowException();
        }
        return data.get(0);
    }

    @Override
    public Integer pop() {
        if (isEmpty()){
            throw new StackUnderflowException();
        }
        return data.remove(0);
    }

    @Override
    public void push(Integer a) {
        data.add(0, a);
    }
}
