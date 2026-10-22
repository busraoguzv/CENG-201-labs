package Exercise2;

import java.util.Scanner;

/**
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 *
 * Name:  Hanife Büşra Oğuz
 * Student ID: 240444012
 * Date: 12.10.2026
 */

public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes
        // 1. Created a singlyLinkedList
        SinglyLinkedList lst1=new SinglyLinkedList();
        // 2. Add 1,2,3,4,5 Nodes to the list
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        // 3. Display the list
        System.out.println("Original List 1:");
        lst1.display();
        // 4. Delete the Middle Node
        lst1.deleteMiddle();
        // 5. Display the list after deleting
        System.out.println("After deleting middle:");
        lst1.display();

        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Created another singlyLİnkedList
        SinglyLinkedList lst2=new SinglyLinkedList();
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        lst2.add(10);
        lst2.add(20);
        lst2.add(30);
        lst2.add(40);
        lst2.add(50);
        lst2.add(60);
        // 3. Display the list
        System.out.println("Original List 2:");
        lst2.display();
        // 4. Delete the Middle Node
        lst2.deleteMiddle();
        // 5. Display the list after deleting
        System.out.println("After deleting middle:");
        lst2.display();
        System.out.println();

        // Test 3: One node

        // 1. Created another singlyLİnkedList
        SinglyLinkedList lst3=new SinglyLinkedList();
        // 2. Add just 999 to the list
        lst3.add(999);
        // 3. Display the list
        System.out.println("Original List 3:");
        lst3.display();
        // 4. Delete the Middle Node (because it has just one node, you just have to delete the head)
        lst3.deleteMiddle();
        // 5. Display the list after deleting
        System.out.println("After deleting middle:");
        lst3.display();


    }
}
