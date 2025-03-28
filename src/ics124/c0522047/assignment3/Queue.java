/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.c0522047.assignment3;

import ics124.assignment3.Ics124Queue;

/**
 * @param <E> the type of elements in this queue
 * @author C0522047 | Caleb Irvine
 */
public class Queue <E> implements Ics124Queue<E>{
    private Ics124SinglyLinkedList<E> queue;
    
    public Queue() {
        queue = new Ics124SinglyLinkedList<>();
    }
        
    @Override
    public boolean add(E e) {
        queue.add(e);
        return true;
    }

    @Override
    //Oracle "Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty."
    public E element() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

    @Override
    //Inserts the specified element into this queue if it is possible to do so
    public boolean offer(E e) {
        return add(e);
    }

    @Override
    //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    public E peek() {
        if (queue.size() == 0) {
            return null;
        } else {
            return queue.get(0);
        }
    }

    @Override
    //Retrieves and removes the head of this queue, or returns null if this queue is empty.
    public E poll() {
        if (queue.size() == 0) {
            return null;
        } else {
            return queue.remove(0);
        }
    }

    @Override
    //Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
    public E remove() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }
    
}
