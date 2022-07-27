package com.programming.injava.hackerRank.dataStructures.trees;

import com.programming.injava.hackerRank.dataStructures.trees.nodes.Node;
import org.springframework.boot.SpringApplication;

public class OrdersTree {
    public static void main(String[] args) {
        SpringApplication.run(OrdersTree.class, args);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("PostOrder => ");
        postOrder(root);
        System.out.println();

        System.out.print("InOrder => ");
        inOrder(root);
        System.out.println();

        System.out.print("PreOrder => ");
        preOrder(root);
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