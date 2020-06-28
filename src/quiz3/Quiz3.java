/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz3;

import singlylinkedlist.SNode;

/**
 *
 * @author Administrator
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SNode<String> person1 = new SNode("Person1", null);
        SNode<String> person2 = new SNode("Person2", null);
        SNode<String> person3 = new SNode("Person3", null);
        SNode<String> person4 = new SNode("Person4", null);
        SNode<String> person5 = new SNode("Person5", null);

        PersonList<SNode> queue = new PersonList<>();
        queue.enqueue(person1);
        queue.enqueue(person2);
        queue.enqueue(person3);
        queue.enqueue(person4);
        queue.enqueue(person5);
        
        try {
            System.out.println("Size: " + queue.size());
            System.out.println("Before Dequeue");
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
            System.out.println("\nAfter Dequeue");
            System.out.println("Removed: " + queue.dequeue().getElement());
            queue.displayQueue();
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
     
    