package ics124.c0522047.assignment3;

import ics124.assignment3.Ics124Stack;
import ics124.assignment3.StackOverflowException;
import ics124.assignment3.StackUnderflowException;

/**
 *
 * @author C0522047 | Caleb Irvine
 */
public class StackUsingArray implements Ics124Stack {
    
    private int size;
    private Integer[] data;
    private Integer top;

    

    public StackUsingArray() {
        this(4);
    }
    
    public StackUsingArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Stack size must be greater than 0");
        }
        this.size = size;
        this.data = new Integer[size];
        this.top = 0;
    }
    
    
    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == size;
    }

    @Override
    public Integer peek() {
        if (isEmpty()){
            throw new StackUnderflowException();
        }
        return data[top-1];
    }

    @Override
    public Integer pop() {
        if (isEmpty()){
            throw new StackUnderflowException();
        }
        Integer a;
        top--;
        a = data[top];
        data[top] = 0;
        return a;
    }

    @Override
    public void push(Integer a) {
        if (isFull()){
            throw new StackOverflowException();
        }
        data[top] = a;
        top++;
    }
}
