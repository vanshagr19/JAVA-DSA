package BinaryTree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

}

public class implementation {

    private static void display(Node root) {
        if (root == null)
            return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    private static int size(Node root) {
        if (root == null)
            return 0;
        return size(root.left) + size(root.right) + 1;
    }

    private static int product(Node root) {
        if (root == null)
            return 1;
        return product(root.left) * product(root.right) * root.val;
    }

    private static int sum(Node root) {
        if (root == null)
            return 0;
        return sum(root.left) + sum(root.right) + root.val;
    }

    private static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(max(root.left), Math.max(max(root.right), root.val));
    }

    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(3);
        Node e = new Node(5);
        Node f = new Node(7);
        Node g = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        // System.out.println(size(a));
        // System.out.println(product(a));
        // System.out.println(sum(a));
        System.out.println(max(a));
        display(a);

    }
}
