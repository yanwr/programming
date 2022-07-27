package com.programming.injava.hackerRank.dataStructures.trees;

import org.springframework.boot.SpringApplication;

import java.util.LinkedList;
import java.util.Scanner;

// Get the Node and transfer to Array of Integer from left to rigth in Tree
public class LevelOrderTraversal {
    // URL = https://www.hackerrank.com/challenges/tree-level-order-traversal/problem?isFullScreen=true
    static class Node {
        private int value;
        private Node left = null;
        private Node right = null;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(LevelOrderTraversal.class, args);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number of Nodes inside Tree: ");
        int n = scanner.nextInt();
        System.out.println("Type each number of Nodes: ");
        int[] nodes = new int[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = scanner.nextInt();
        }

        Node root = null;
        for(int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        System.out.println("Response = ");
        levelOrder(root);
    }

    private static void levelOrder(Node root) {
        int height = getHeight(root);
        for(int i = 1; i <= height + 1; i++) {
            levelOrderByLevel(root, i);
        }
    }

    private static void levelOrderByLevel(Node node, int level) {
        if(node == null) return;
        if(level == 1) {
            System.out.print(node.value + " ");
        } else if(level > 1) {
            levelOrderByLevel(node.left, level - 1);
            levelOrderByLevel(node.right, level - 1);
        }
    }

    private static int getHeight(Node root) {
        if(root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    private static Node insert(Node current, int value) {
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

    // another way to do in Java
    private static void levelOrder2(Node root) {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {
            if(queue.peek().left != null) {
                queue.add(queue.peek().left);
            }
            if(queue.peek().right != null) {
                queue.add(queue.peek().right);
            }
            System.out.print(queue.poll().value + " ");
        }
    }

    // another way to do in Java
    private static void levelOrder3(Node root) {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");
            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }
    }

}