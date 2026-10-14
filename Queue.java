// Queue implementation using array
/*public class Queue {
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeuq
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {

        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/

// circular queue implementation using array
/*public class Queue {

    static class cQueue {
        static int arr[];
        static int size;
        static int rear = -1, front = -1;

        cQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full Circular Queue.");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Circualr Queue.");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Circular Queue.");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {

        cQueue q = new cQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/

// Queue implemetation using LinkedList
public class Queue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        
        //  Enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //  Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        //  Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return head.data;
        }
        
    }

    public static void main(String[] args) {

        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

// Queue implementation using java framework
/*import java.util.*;

public class Queue {

    public static void main(String[] args) {

        // java.util.Queue<Integer> q = new LinkedList<>();
        java.util.Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/

/* QUESTION
 Queue using 2 stack*/
/*import java.util.Stack;
public class Queue {

    static class queue {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Enqueue
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s2.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            return s1.pop();
        }
        
        // Peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            
            return s1.peek();
        }
    }

    public static void main(String[] args) {

        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(queue.peek());
            q.remove();
        }
    }
}*/