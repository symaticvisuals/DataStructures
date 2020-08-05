package com.HashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
      TreeMap<String,String> map = new TreeMap<>();
        map.put("orange", "bekar hai");
        map.put("mango", "theek hai");
        map.put("apple", "keeps doctor away");
        System.out.println(map.get("orange"));
        for(String str : map.keySet()){  //forr each loop
            System.out.println(str);
        }
        System.out.println(map);
        System.out.println();
        System.out.println();
        System.out.println(fre("Raftaar"));
    }
    public static HashMap<Character,Integer> fre (String s)
    {
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(freq.containsKey(ch))
            {
                freq.put(ch,freq.get(ch)+1);
            }
            else
                freq.put(ch,1);
        }
        return freq;
    }
}
