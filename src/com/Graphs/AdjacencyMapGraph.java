package com.Graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
//TODO Important Kruskal Algorithm (Greedy Algorithm)
public class AdjacencyMapGraph<T> {
    HashMap<T,Vertex> vertexMap = new HashMap<>();
    HashMap<Vertex,Vertex> parent = new HashMap<>();

    public void addVertex(T value)
    {
        vertexMap.put(value,new Vertex(value));
    }

    public void addEdge(T first, T second)
    {
        if(vertexMap.containsKey(first)&&vertexMap.containsKey(second))
        //checking does first and second present in a graph
        {
            vertexMap.get(first).neighbours.put(vertexMap.get(second),1);
            vertexMap.get(second).neighbours.put(vertexMap.get(first),1);
            //Or we can write this
//            Vertex f= vertexMap.get(first);
//            Vertex s = vertexMap.get(second);
//            f.neighbours.put(s,1);
//            s.neighbours.put(f,1);
        }
    }

    public void addEdge(T first, T second,int weight)
    {
        if(vertexMap.containsKey(first)&&vertexMap.containsKey(second))
        //checking does first and second present in a graph
        {
            vertexMap.get(first).neighbours.put(vertexMap.get(second),weight);
            vertexMap.get(second).neighbours.put(vertexMap.get(first),weight);
            //Or we can write this
//            Vertex f= vertexMap.get(first);
//            Vertex s = vertexMap.get(second);
//            f.neighbours.put(s,weight);
//            s.neighbours.put(f,weight);
        }
    }

    public void display()
    {
        for (Vertex vertex:vertexMap.values()) {

            System.out.print(vertex.value+" => ");

            for (Vertex padosi:vertex.neighbours.keySet()) {
                System.out.print(padosi.value+" ");
            }

            System.out.println();
        }
    }

    public boolean union(Vertex first, Vertex second)
    {
    Vertex f = Find(first);
    Vertex s = Find(second);

    if(!f.value.equals(s.value))
    {
        parent.put(f,s);
        return true;
    }
    return false;
    }

    public Vertex Find(Vertex vertex)
    {
    while (parent.get(vertex)!=null)
    {
        vertex = parent.get(vertex);
    }
    return vertex;
    }

    public void setParent()
    {
        for (Vertex vertex:vertexMap.values()) {
            parent.put(vertex,null);
        }
    }

    public AdjacencyMapGraph<T> Kruskal()
    {
        setParent();

        AdjacencyMapGraph<T> finalmap = new AdjacencyMapGraph<>();
        ArrayList<Edge> edges = new ArrayList<>();

        for(T vertex : vertexMap.keySet())
        {
            finalmap.addVertex(vertex);
        }

        for (Vertex vertex : vertexMap.values()) {
            for (Vertex padosi:vertex.neighbours.keySet() )
            {
                edges.add(new Edge(vertex,padosi,vertex.neighbours.get(padosi)));
            }
        }
        Collections.sort(edges);

        for (Edge e:edges) {
            if(union(e.first,e.second))
            {
                finalmap.addEdge(e.first.value,e.second.value,e.weight);
            }
        }
        return finalmap;
    }

    class Edge implements Comparable<Edge>{
        Vertex first;
        Vertex second;
        int weight;

        public Edge(Vertex first, Vertex second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge old) {
            return this.weight - old.weight;
        }
    }

    class Vertex
    {
        T value;
        HashMap<Vertex,Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours= new HashMap<>();
        }
    }
}
