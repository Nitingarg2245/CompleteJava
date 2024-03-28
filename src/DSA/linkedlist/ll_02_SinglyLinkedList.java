package DSA.linkedlist;

public class ll_02_SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public static Node deleteAtHead(Node head) {
        if (head == null) {
            System.out.println("Empty linked list");
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    public static Node deleteAtTail(Node head) {
        if (head == null) {
            System.out.println("Empty linked list");
            return null;
        }
        if (head.next == null) {
            // If only one node is present
            head = null;
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        // Direct SLL creation manually
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.next = second;
        second.next = third;
        third.next = fourth;
        Node tail = fourth;
        print(head);

        head = insertAtHead(head, 45); // New head will be returned
        head = insertAtHead(head, 60);
        print(head);
        System.out.println("New head: " + head.data);

        tail = insertAtTail(head, 99); // New tail will be returned
        tail = insertAtTail(head, 100);
        print(head);
        System.out.println("New tail: " + tail.data);

        head = deleteAtHead(head); // New head will be returned
        head = deleteAtHead(head);
        print(head);
        System.out.println("New head: " + (head != null ? head.data : "null"));

        head = deleteAtTail(head);
        head = deleteAtTail(head);
        print(head);
        System.out.println("New head: " + (head != null ? head.data : "null"));
    }
}
