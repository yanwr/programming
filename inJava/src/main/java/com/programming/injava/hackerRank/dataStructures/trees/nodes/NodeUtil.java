package com.programming.injava.hackerRank.dataStructures.trees.nodes;

public class NodeUtil {
    public static Node insert(Node current, int value) {
        if(current == null) return new Node(value);

        if(value < current.value) {
            current.left = insert(current.left, value);
        } else if (value > current.value) {
            current.right = insert(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public static Node delete(Node root, int value)  {
        if(root == null) return root;

        if(value < root.value) {
            root.left = delete(root.left, value);
        } else if(value > root.value) {
            root.right = delete(root.right, value);
        } else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            root.value = getMinValue(root.right);
            root.right = delete(root.right, root.value);
        }
        return root;
    }

    public static Node search(Node root, int value) {
        if (root==null || root.value == value) return root;

        if (root.value > value) {
            return search(root.left, value);
        }
        return search(root.right, value);
    }

    public static int getHeight(Node root) {
        if(root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static int getMinValue(Node root)  {
        int minval = root.value;
        while (root.left != null)  {
            minval = root.left.value;
            root = root.left;
        }
        return minval;
    }

    public static void postOrder(Node root) {
        if(root == null) return;

        // Primeiro vai pela esquerda
        postOrder(root.left);

        // Depois vai para direita
        postOrder(root.right);

        // E dai printa
        System.out.print(root.value + " ");
    }

    public static void inOrder(Node root) {
        if(root == null) return;

        // Primeiro vai pela esquerda
        inOrder(root.left);

        // E dai printa
        System.out.print(root.value + " ");

        // Depois vai para direita
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if(root == null) return;

        // Primeiro printa
        System.out.print(root.value + " ");

        // E vai pela esquerda
        preOrder(root.left);

        // Depois vai para direita
        preOrder(root.right);
    }
}
