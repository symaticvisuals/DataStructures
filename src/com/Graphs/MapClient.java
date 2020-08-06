package com.Graphs;

public class MapClient {

    public static void main(String[] args) {
        AdjacencyMapGraph<String> graph = new AdjacencyMapGraph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        //graph.addVertex("E");
        graph.addEdge("A","B",4);
        graph.addEdge("B","D",3);
        graph.addEdge("A","C",1);
        graph.addEdge("C","D",2);


        AdjacencyMapGraph<String> map = graph.Kruskal();
        map.display();
    }

}
