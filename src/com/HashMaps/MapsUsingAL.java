package com.HashMaps;

import java.util.LinkedList;

import java.util.ArrayList;

public class MapsUsingAL <K,V> {
    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    int size =0;
    float lf = 0.5f; //fore rehashing
    public MapsUsingAL() {

        for (int i = 0; i <10 ; i++) {

            entities.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){

        if((float)(size)/entities.size() > lf)
        {
            rehash();
        }

        int index = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(index);

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                entity.value = value;
                return;
            }
        }

        list.add(new Entity(key,value));
        size++;
    }

    private void rehash() {
    ArrayList<LinkedList<Entity>> old = entities;

    entities = new ArrayList<>();
        for (int i = 0; i <old.size()*2 ; i++) {
            entities.add(new LinkedList<>());
        }
        //main
        size=0; //when rehashing size needs to be zero
        for(LinkedList <Entity> list: old)
        {
            for(Entity entity : list)
            {
                put(entity.key, entity.value);
            }
        }
    }

    public V get(K key){

        int index = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(index);

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                return entity.value;
            }
        }

        return null;
    }


    public V remove(K key){


        int index = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(index);

        Entity target = null;

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                target = entity;
                size--;
                break;
            }
        }

        V temp = target.value;
        list.remove(target);

        return temp;
    }

    class Entity{

        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
