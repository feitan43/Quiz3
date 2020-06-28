/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import java.util.logging.Level;
import java.util.logging.Logger;
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
        Person p1 = new Person(1, "James");
        Person p2 = new Person(5, "Alisa");
        Person p3 = new Person(7, "Joana");
        Person p4 = new Person(13, "Clian");
        Person p5 = new Person(10, "Yanie");

        SNode<Person> person1 = new SNode<>(p1, null);
        SNode<Person> person2 = new SNode<>(p2, null);
        SNode<Person> person3 = new SNode<>(p3, null);
        SNode<Person> person4 = new SNode<>(p4, null);
        SNode<Person> person5 = new SNode<>(p5, null);

        QueueList<SNode> transaction = new QueueList<>();
        transaction.enqueue(person1);
        transaction.enqueue(person2);
        transaction.enqueue(person3);
        transaction.enqueue(person4);
        transaction.enqueue(person5);

        try {
            displayTransactions(transaction);
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println();
            displayTransactions(transaction);
            
        } catch (EmptyQueueException ex) {
            System.out.println("The queue is empty.");
        }

    }

    private static void displayTransactions(QueueList<SNode> queueList) throws EmptyQueueException {
        SNode<Person> temp = queueList.first();
        for (int i = 0; i < queueList.size(); i++) {
            System.out.println("Transaction No." + (i + 1) + ": " + temp.getElement().getName()
                    + ", Person ID: " + temp.getElement().getPersonID());
            temp = temp.getNext();
        }
    }
}
