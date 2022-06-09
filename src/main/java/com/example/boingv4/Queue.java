package com.example.boingv4;
/**
 * Queue.java
 *
 * @version 4.0.0
 * @author Thomas McAuley (2110735)
 * Last Modified - 24/02/2022
 * Copyrighted
 *
 * A class that implements a queue for closed shapes that will be added
 * to the canvas.
 */

import java.util.NoSuchElementException;

public class Queue<T> {
    private QueueElement<T> head;
    private QueueElement<T> rear;

    /**
     *
     * Constructs an empty Queue.
     */
    public Queue() {
        //Sets head and rear equal to null since nothing is in the queue yet
        head = null;
        rear = null;
    }

    /**
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return ((head == null) && (rear == null));
    }

    /**
     *
     * @return the element at the head of the queue
     */
    public T peek() throws NoSuchElementException {
        //If the queue isn't empty, tell us the first element in the queue
        if (head != null) {
            return head.getElement();
        } else {
            throw new NoSuchElementException("Sorry there are no elements in the queue");
        }
    }

    /**
     *
     * Removes the element at the head of the queue
     */
    public void dequeue() throws NoSuchElementException {
        //If the queue isn't empty, remove the first element in the queue
        if (!isEmpty()) {
            head = head.getNext();
            if (head == null && rear != null) {
                rear = null;
            }
        } else {
            throw new NoSuchElementException("Sorry there are no elements in the queue");
        }
    }

    /**
     *
     * Puts an element on the rear of the queue.
     */
    public void enqueue(T element) {
        //If there is only one element in the queue,
        //that element is both the head and the rear of the queue.
        //Otherwise, the next element is the rear
        QueueElement<T> newNode = rear;
        rear = new QueueElement<>(element, null);
        if (head == null) {
            head = rear;
        } else {
            newNode.setNext(rear);
        }
    }

    /**
     *
     * Method to print the full contents of the queue in order from head to tail.
     */
    public void print() {
        //Code to print the code is needed here
        QueueElement<T> currentElement = head;
        while (currentElement != null) {
            System.out.println(currentElement.getElement());
            currentElement = currentElement.getNext();
        }
    }
}
