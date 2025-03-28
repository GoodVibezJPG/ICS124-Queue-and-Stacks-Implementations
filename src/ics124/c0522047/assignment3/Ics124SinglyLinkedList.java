package ics124.c0522047.assignment3;

/**
 * A generic singly linked list class.
 *
 * Should hold an arbitrary number of elements.
 *
 * @author C0522047
 * @param <T> the class of the payloads inside the list
 */


public class Ics124SinglyLinkedList<T>  {

    private class SlNode {
        //Data instead of x helps me visualize
        private T data; // Data stored in node
        private SlNode next; //Pointing to next node

        //Constructor; it's next default points to null
        public SlNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private SlNode head;
    private SlNode tail;
    private int length;

    //Constructor initializing as empty
    public Ics124SinglyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    //Returns current size of list
    public int size() {
      return length;
    }

    //Returns element at the i index, if i out of bounds; throws exception
    public T get(int i) {
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds");
        }
        SlNode current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int i, T x) {
        //If index is out of bounds, throw exception
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds");
        }
        //Set the data at the i index
        SlNode current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        current.data = x;
    }

    //no index defualt to append
    public void add(T x) {
        SlNode newNode = new SlNode(x);
        if (length == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    public void add(int i, T x) {
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds");
        }
        SlNode newNode = new SlNode(x);
        if (i == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
            }
        } else {
            SlNode current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
        length++;
    }
    
    public T remove(int i) {
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds");
        }
        T removedData;
        if (i == 0) {
            removedData = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            SlNode current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
        length--;
        return removedData;
    }
}
