package com.hackerblocks;

import javax.swing.tree.AbstractLayoutCache;
import java.awt.image.CropImageFilter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MirrorTree {
    static Scanner s = new Scanner(System.in);
    private class Node
    {
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public MirrorTree()
    {
        this.root=Create_Node();
    }

    private Node Create_Node()
    {
    int item = s.nextInt();
    Node node = new Node();
    node.data = item;
    this.root=node;
        LinkedList<Node> Queue = new LinkedList<>();
        Queue.add(node);
        while (!Queue.isEmpty())
        {
            int c1 = s.nextInt();
            int c2 = s.nextInt();
            node = Queue.removeFirst();
            if(c1!=-1)
            {
                Node nn = new Node();
                nn.data = c1;
                node.left = nn;
                Queue.addLast(node.left);
            }
            if(c2!=-1)
            {
                Node nn = new Node();
                nn.data = c2;
                node.right = nn;
                Queue.addLast(node.right);
            }
        }
        return root;
    }

   // public void display() to be written

    public  boolean IsSymetric()
    {
        return MirrorTree(this.root,this.root);
    }
    private boolean MirrorTree(Node node1 , Node node2)
    {
        if(node1==null || node2 == null)
        {
            return node1==node2;
        }
        if(node1.data!=node2.data)
        {
            return false;
        }
        return MirrorTree(node1.left,node2.right) && MirrorTree(node1.right,node2.left);
    }
    public static void main(String[] args) {
    MirrorTree m = new MirrorTree();
        System.out.println(m.IsSymetric());
    }
}
