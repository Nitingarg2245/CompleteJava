package DSA.linkedlist;


public class ll_01_DoublyLinkedList {
    static class  Node {
        int data;
        Node next;//reference variable that is going to hold the address of Node class object
        Node prev;

        Node() {
            data = 0;
            next = null;
            prev = null;
        }

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
        public static void print(Node head) {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("\n");
        }
        public static Node deleteAtHead(Node head, Node tail) {
            if (head==null || tail == null)
            {
                System.out.println("empty double linked list");
                return null;
            }
            Node temp = head;
            head = head.next;
            if (head != null)head.prev = null; //this is imp other wise null pointer exception aa skti hai
            temp.next = null;
            return head;
        }

        public static Node deleteAtTail(Node head, Node tail) {
            if (head==null || tail == null)
            {
                System.out.println("empty double linked list");
                return null;
            }
            Node temp = tail;
            tail = tail.prev;
            if (tail != null) tail.next = null;
            temp.prev = null;
            return tail;
        }

        public static Node insertAtHead(Node head, Node tail, int data) {
            Node newNode = new Node(data);
            if (head == null ) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            return head;
        }

        public static Node insertAtTail(Node head, Node tail, int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            return tail;
        }

        public static void main(String[] args) {
            //direct DLL creation manually
            Node head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);
            head.next = second;
            second.prev = head;
            second.next = third;
            third.prev = second;
            third.next = fourth;
            fourth.prev = third;
            Node tail = fourth;
            print(head);

            head = insertAtHead(head, tail, 45);//new head will be returned
            head = insertAtHead(head, tail, 60);
            print(head);
            System.out.println("new head:" + head.data + " " + "new tail:" + tail.data);

            tail = insertAtTail(head, tail, 99);//new tail will be returned
            tail = insertAtTail(head, tail, 100);
            print(head);
            System.out.println("new head:" + head.data + " " + "new tail:" + tail.data);

            head = deleteAtHead(head, tail);//new head will be returned
            head = deleteAtHead(head, tail);
            print(head);
            System.out.println("new head:" + head.data + " " + "new tail:" + tail.data);

            tail=deleteAtTail(head,tail);
            tail=deleteAtTail(head,tail);
            print(head);
            System.out.println("new head:" + head.data + " " + "new tail:" + tail.data);
    }
}
