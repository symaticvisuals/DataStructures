package com.Trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreeClient {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input");
        BinaryTrees trees = new BinaryTrees();
        Scanner s = new Scanner(file);

        trees.insert(s);
        trees.insert(s);
        trees.insert(s);
        trees.insert(s);
        trees.preorder();
        System.out.println();
       trees.mirror();
       trees.preorder();

    }
}

