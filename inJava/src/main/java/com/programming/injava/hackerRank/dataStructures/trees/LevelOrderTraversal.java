package com.programming.injava.hackerRank.dataStructures.trees;

import com.programming.injava.hackerRank.dataStructures.trees.nodes.Node;
import com.programming.injava.hackerRank.dataStructures.trees.nodes.NodeUtil;
import org.springframework.boot.SpringApplication;
import java.util.LinkedList;
import java.util.Scanner;

// Get the Node and transfer to Array of Integer from left to rigth in Tree
public class LevelOrderTraversal {
    // URL = https://www.hackerrank.com/challenges/tree-level-order-traversal/problem?isFullScreen=true

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
            root = NodeUtil.insert(root, nodes[i]);
        }

        System.out.println("Response = ");
        levelOrder(root);
    }

    public static void levelOrder(Node root) {
        int height = NodeUtil.getHeight(root);
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