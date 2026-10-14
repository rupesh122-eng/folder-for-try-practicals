public class Rev_linkedlist {

    Node head;
    private int size;

    Rev_linkedlist() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add --> first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add --> last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // remove --> first
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        size--;
        head = head.next;
    }

    // remove --> last
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Reverse with Interation
    public void revIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    // Reverse with Recursion
    public Node revRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = revRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {

        Rev_linkedlist list = new Rev_linkedlist();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
        // list.revIterate();
        list.head = list.revRecursion(list.head);
        list.printList();

        // System.out.println(list.getSize());
    }
}