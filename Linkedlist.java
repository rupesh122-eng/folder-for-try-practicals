/*public class Linkedlist {

    Node head;
    private int size;

    Linkedlist() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node (int data) {
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
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

     // add --> last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return ;
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
            System.out.print("List is empty.");
            return ;
        }

        size--;
        head = head.next;
    }

    // remove --> last
    public void removeLast() {
        if (head == null) {
            System.out.print("List is empty.");
            return ;
        }

        size--;
        if(head.next == null) {
            head = null;
            return ;
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
            System.out.print("List is empty.");
            return ;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
     
    public static void main(String[] args) {
        
        Linkedlist list = new Linkedlist();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(5);
        list.addLast(6);
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.size);
    }
}*/

import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);

        list.addLast(3);
        list.add(4);
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}