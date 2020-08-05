package com.Graphs;

public class GraphClient {
    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList();
        list.addVertex("A");
        list.addVertex("B");
        list.addVertex("C");
        list.addVertex("D");
        //list.addVertex("E");
        list.addEdge("A","B");
        list.addEdge("B","D");
        list.addEdge("A","C");
        list.addEdge("C","D");
        //list.DFT();
        //list.display();
        //list.BFT();
        System.out.println(list.isconnected());



    }
}
