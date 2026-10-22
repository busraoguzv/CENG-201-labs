package Exercise2;



/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:  Hanife Büşra Oğuz
 * Your Student ID: 240444012
 * Your Date:  12.10.2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {
        // 1. Create a new Node.
        Node newNode=new Node(data);
        // 2. If the list is empty, make the new node the head.
        if(head==null){
            head=newNode;
        }else{
            // 3. Otherwise, traverse to the last node.
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            // 4. Link the last node to the new node.
            current.next=newNode;
        }


    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
            // Start from head.
            Node current = head;
            while (current != null) {
                // Print the data values in this format:
                //
                // 1 --> 2 --> 3 --> 4 --> 5 --> NULL
                System.out.print(current.data + " --> ");
                // Visit each node using next.
                current = current.next;
            }
            System.out.println("NULL");


        }


    // -------------------------------------------------------
    // Delete the middle node

    public void deleteMiddle() {

        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        // Step 1: Count the total number of nodes.
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        // Step 2: Find the node before the middle node.
        int midIndex = count / 2;
        Node prev = null;
        current = head;
        for (int i = 0; i < midIndex; i++) {
            prev = current;
            current = current.next;
        }
        if (prev != null) {
            // Then change its next reference so that
            prev.next = current.next;
            // the middle node is removed from the list.
        }

        //
        // Remember:
        // - For an odd number of nodes, delete the middle.
        // - For an even number of nodes, delete the SECOND middle.
        // - If there is only one node, the list becomes empty.
    }

    // Get the head
    public Node getHead() {
        return head;
        }
    }
