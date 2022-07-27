package com.programming.injava.hackerRank.dataStructures.trees;

import com.programming.injava.hackerRank.dataStructures.trees.nodes.Node;
import com.programming.injava.hackerRank.dataStructures.trees.nodes.NodeUtil;
import org.springframework.boot.SpringApplication;

public class BinarySearchTree {
    public static void main(String[] args) {
        SpringApplication.run(BinarySearchTree.class, args);
        int arr[] = { 34, 84, 15, 0, 2, 99, 79, 9, 88, 89, 18, 31, 39, 100, 101 };

        Node root = null;
        for(int i = 0; i < 13; i++) {
            root = NodeUtil.insert(root, arr[i]);
        }

        Node temp = search(root, 98);
        if(temp != null) {
            System.out.println("Found the value inside tree! " + temp.value);
        } else {
            System.out.println("Not found the value inside tree! ");
        }
    }

    public static Node search(Node root, int x) {
        if (root==null || root.value == x) return root;

        if (root.value > x) {
            return search(root.left, x);
        }
        return search(root.right, x);
    }
}
