/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics124.assignment3;

/**
 *
 * @author C0522047
 */
public interface Ics124Queue<E>{
    boolean add(E e);
    E element();
    boolean offer(E e);
    E peek();
    E poll();
    E remove();
}
