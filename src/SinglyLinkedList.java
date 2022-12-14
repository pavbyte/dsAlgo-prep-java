public class SinglyLinkedList {

    public Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // to find length of a linked list we will just add a counter or can make a new
    // function

    public void length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("\nlength of the linked-list is " + count);
    }

    /*
     * we could have added a counter and printed it in the display method itself
     * we did it in a separate function for the separation of concern and make our
     * code modular
     */

    public void display() {
        System.out.println("We are about to print our LinkedList");
        Node current = head;
        System.out.print("<head> ");
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.print(" <tail>");
    }

    /*
     * this is the fucntion to add a new element at the head of the linkedlist
     */

    public void addElementFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addElementLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList s11 = new SinglyLinkedList();
        s11.head = new Node(50);
        Node second = new Node(3);
        Node third = new Node(5);
        Node fourth = new Node(10);

        s11.head.next = second;
        second.next = third;
        third.next = fourth;

        s11.display();

        s11.addElementFirst(116);
        s11.addElementFirst(1169);
        s11.display();
        s11.addElementLast(116229);
        s11.addElementLast(0);
        s11.addElementLast(8);
        s11.display();
        s11.length();

    }

}
