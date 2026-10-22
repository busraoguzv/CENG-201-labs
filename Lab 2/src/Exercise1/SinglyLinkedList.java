package Exercise1;

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
        // 1. Create a new Exercise1.Node.
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
        if(head==null){
            System.out.println("NULL");
            return;
        }
        // Start from head.
        Node current=head;
        while(current!=null){
            // Print the data values in this format:
            //
            // 1 --> 2 --> 3 --> 4 --> 5 --> NULL
            System.out.print(current.data+" --> ");
            // Visit each node using next.
            current=current.next;
        }
        System.out.println("NULL");


    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        // Find and return the middle node.
        if(head==null){
            return null;
        }
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;

        }
        int midIndex=count/2;
        // For an odd number of nodes:
        //     1 --> 2 --> 3 --> 4 --> 5
        //                 ^
        //              middle
        //
        // For an even number of nodes:
        //     10 --> 20 --> 30 --> 40 --> 50 --> 60
        //                          ^
        //                        middle
        // IMPORTANT:
        // For an even-sized list, return the SECOND
        // middle node.
        current=head;
        for(int i=0;i<midIndex;i++){
            current=current.next;
        }
        return current;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}