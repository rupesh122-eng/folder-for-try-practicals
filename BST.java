
// 1.   Build BST. ---> O(H)
import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left
            root.left = insert(root.left, val);
        } else {
            // right
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 2. Search BST. ---> O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    // Delete a node from BST. ---> O(H)
    public static Node delete(Node root, int key) {
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            // case 1
            if (root.left == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, key);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print all elements in a given range. ---> O(N)
    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }

        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= X) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }

    // Root to leaf path using arrayList ---> O(N)
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "-> ");
        }
        System.out.println();
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if (search(root, 6)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        delete(root, 14);
        inorder(root);

        System.out.println();

        printInRange(root, 3, 7);
        System.out.println();

        rootToLeaf(root, new ArrayList<>());
    }
}