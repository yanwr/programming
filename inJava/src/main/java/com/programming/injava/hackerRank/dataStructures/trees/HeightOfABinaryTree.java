package com.programming.injava.hackerRank.dataStructures.trees;

import com.programming.injava.hackerRank.dataStructures.trees.nodes.Node;
import org.springframework.boot.SpringApplication;
import java.util.Scanner;

public class HeightOfABinaryTree {
    // URL = https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem?isFullScreen=true

    public static void main(String[] args) {
        SpringApplication.run(HeightOfABinaryTree.class, args);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nodes = new int[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = scanner.nextInt();
        }

        Node root = null;
        for(int i = 0; i < nodes.length; i++) {
            root = addRecursive(root, nodes[i]);
        }

        System.out.println("Response = " + getHeight(root));
    }

    private static Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

//    private static int getHeight2(Node root) {
//        if(root == null) return 0;
//        int r = Math.max(getHeight2(root.left), getHeight2(root.right));
//        if(root.left == null && root.right == null) {
//            return r;
//        }
//        return 1 + r;
//    }

    private static int getHeight(Node root) {
        if(root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}