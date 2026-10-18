package Exercise1;

/**
 * Exercise1.MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Name:   Hanife Büşra Oğuz
 * Student ID: 240444012
 * Date:  12.10.2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes

        // 1. Created a singlyLİnkedList
        SinglyLinkedList list1=new SinglyLinkedList();
        // 2. Add 1,2,3,4,5 Nodes to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        // 3. Display the list
        System.out.println("List 1:");
        list1.display();
        // 4. Found and print the middle Exercise1.Node
        System.out.println("Middle Node: " +list1.findMiddle().data );
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Created another singlyLİnkedList
        SinglyLinkedList list2=new SinglyLinkedList();
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        // 3. Display the list
        System.out.println("List 2:");
        list2.display();
        // 4. Found and print the middle Exercise1.Node
        System.out.println("Middle Node: " +list2.findMiddle().data );
        System.out.println();
    }
}
