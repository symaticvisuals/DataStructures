package com.Trees;

public class BinarySearchClient {
    public static void main(String[] args) {
        BinarySearchTrees trees = new BinarySearchTrees();

        int [] pre ={7,4,2,5,15,25};
        int[] in = { 2,4,5,7,15,25};
        trees.makefromprein(pre,in);
        trees.display();
        System.out.println(trees.isbalanced());
    }
}
