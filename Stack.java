// Through linked list
/*public class Stack {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class InnerStack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        
        // Push
        public static void push(int data) {
            Node neWNode = new Node(data);
            if (isEmpty()) {
                head = neWNode;
                return;
            }
            neWNode.next = head;;
            head = neWNode;
            
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head= head.next;
            return top;
        }

        //Peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String[] args) {
        
        InnerStack s = new InnerStack();
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

// Through array list
/*import java.util.ArrayList;
public class Stack {
    
    static class stack {
        
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.isEmpty();
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() {
            return list.get(list.size() - 1);
        }
        
    }
    public static void main(String[] args) {
        
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

// Through java frameWork
/*public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

// Q1. Push at the bottom of stack
/*public class Stack {

    public static void pushAtBottom(int data, java.util.Stack <Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return ;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);  
    }
    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

// Q2. Reverse a stack
public class Stack {

    public static void pushAtBottom(int data, java.util.Stack<Integer> s) {

        if(s.isEmpty()) {
            s.push(data);
            return ;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(java.util.Stack<Integer> s) {
        if(s.isEmpty()) {
            return ;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    } 

    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}