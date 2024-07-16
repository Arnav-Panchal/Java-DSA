package src.Arrays;

public class eg {

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //step1=create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step1=create new node
        //Node newNode = new Node(data);

        //step2= newNode next = head
        newNode.next = head;  //link

        //step3= head=newNode
        head = newNode;

    }
//    methods
//    add
//    remove
//    search etc we will use the methods

    public static void main(String[] args) {
        eg ll = new eg();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.display(); // This will print the elements of the linked list
    }
}