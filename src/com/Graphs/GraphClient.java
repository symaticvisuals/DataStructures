package com.Graphs;

public class GraphClient {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        //graph.addVertex("E");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("A","C");
        graph.addEdge("C","D");
        //graph.DFT();
        //graph.display();
        //graph.BFT();
        System.out.println(graph.bipartite());
        System.out.println(graph.isconnected());



    }
}
