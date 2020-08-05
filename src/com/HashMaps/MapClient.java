package com.HashMaps;

public class MapClient {
    public static void main(String[] args) {
        MapUsingArrays maps = new MapUsingArrays();
        maps.put("orange", "gadha");
        //maps.put("mango","theek");
        maps.put("grape","delicious");
        System.out.println(maps.get("orange"));
        System.out.println(maps.remove("orange"));
        System.out.println(maps.get("orange"));
    }
}
