//  Build Tree Preorder
/*public class BinaryTrees {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class InnerBinaryTrees {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public Node buildTree(int nodes[]) {
        InnerBinaryTrees.idx = -1;
        return InnerBinaryTrees.buildTree(nodes);
    }

    public static void main(String[] args) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}*/

/*   PreOrder --> O(n)
    Inorder --> O(n)
    Postorder --> O(n) */

import java.util.*;

public class BinaryTrees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class InnerBinaryTrees {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public Node buildTree(int nodes[]) {
        InnerBinaryTrees.idx = -1;
        return InnerBinaryTrees.buildTree(nodes);
    }

    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Levelorder traversal --> O(n)
    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        java.util.Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if (curNode == null) {

                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    // count of nodes ---> O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode + rightNode + 1;
    }

    // Sum of nodes ---> O(n)
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    // Height of tree ---> O(n)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int treeHeight = Math.max(leftHeight, rightHeight) + 1;

        return treeHeight;
    }

    // Diameter of tree , Approach 1 ---> O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // Diameter of tree, Approrach 2 ---> O(n)
    static class TreeInfo {
        int height;
        int diam;

        TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {

        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

        return myInfo;
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}
