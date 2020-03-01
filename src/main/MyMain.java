package main;

import searchtree.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(100);
        bst.insert(115);
        bst.insert(98);
        bst.insert(56);
        bst.insert(8);
        bst.insert(78);
        bst.insert(55);
        bst.insert(33);
        bst.insert(65);
        bst.insert(87);
        bst.insert(34);
        bst.traversePreOrder(bst.getRoot());
        System.out.println();
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        bst.traversePostOrder(bst.getRoot());
        System.out.println(bst.search(200));
    }
}
