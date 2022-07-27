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

    public static int getHeight(Node root) {
        if(root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
