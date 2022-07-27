package com.programming.injava.hackerRank.dataStructures.trees;

import com.programming.injava.hackerRank.dataStructures.trees.nodes.Node;
import com.programming.injava.hackerRank.dataStructures.trees.nodes.NodeUtil;
import org.springframework.boot.SpringApplication;

public class InvertBinaryTree {

    public static void main(String[] args) {
        SpringApplication.run(InvertBinaryTree.class, args);

//        Node root = new Node(4);
//        root.left = new Node(2);
//        root.left.left = new Node(1);
//        root.left.right = new Node(3);
//
//        root.right = new Node(7);
//        root.right.left = new Node(6);
//        root.right.right = new Node(9);
//
//        root = invertTree(root);
//        LevelOrderTraversal.levelOrder(root);


        Node root2 = null;
        int[] nodes = { 4, 2, 7, 1, 3, 6, 9 };
        for(int i = 0; i < nodes.length; i++) {
            root2 = NodeUtil.insert(root2, nodes[i]);
        }
        System.out.print("Input => ");
        LevelOrderTraversal.levelOrder(root2);
        System.out.println();
        System.out.print("Response => ");
        root2 = invertTree(root2);
        LevelOrderTraversal.levelOrder(root2);
    }

    private static Node invertTree(Node root) {
        if(root == null) return root;

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
