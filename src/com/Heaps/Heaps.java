package com.Heaps;

import java.util.ArrayList;
import java.util.HashMap;

//TODO UDERSTAND HEAPS BETTER FOR ALGO
//min heaps
public class Heaps <T extends Comparable<T>>{
    ArrayList<T> list = new ArrayList<>();
    HashMap<T,Integer> map = new HashMap<>();   //used in prims
    public void insert(T element)
    {
     list.add(element);
     map.put(element,list.size()-1); // used in prims
     upheap(list.size()-1);
    }

    private void upheap(int index) { //last to first
        if(index==0)
        {
            return;
        }
        int parent = parent(index);

        if(list.get(parent).compareTo(list.get(index))>0)
        {
            swap(parent,index);
            upheap(parent);
        }
    }
    public boolean isEmpty()
    {
        return list.isEmpty(); //used in prims
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        T temp1 = list.get(second);//used in prims
        list.set(first,list.get(second));
        list.set(second,temp);

        //used in prims
        map.put(temp,second);
        map.put(temp1,first);
    }

    public int parent(int index)
    {
        return (index-1)/2;
    }

    public int leftchild(int index)
    {
        return 2*index+1;
    }

    public int rightchild(int index)
    {
        return 2*index+2;
    }

    public void display()
    {
        System.out.println(list);
    }

    public T remove()
    {
        if(list.isEmpty())
        {
            System.out.println("List is Empty");
            return null;
        }
        T temp = list.get(0);//node 1
        T delete = list.remove(list.size()-1);
        if(!list.isEmpty())
        {
            list.set(0,delete);
            downheap(0);
        }
        return temp;
    }
    public T removeforprimes()
    {
        swap(0,list.size()-1);

        T temp = list.remove(list.size()-1);

        downheap(0);

        return temp;
    }
    public  void update(T pair)
    {
        int index = map.get(pair);
        upheap(index);
    }
    private void downheap(int index) {
        int min = index;
        int left = leftchild(index);
        int right = rightchild(index);
        if(left < list.size() && list.get(left).compareTo(list.get(min))<0)
        {
            min=left;
        }
        if(right<list.size() && list.get(right).compareTo(list.get(min))<0)
        {
            min=right;
        }
        if(min!=index)
        {
            swap(min,index);
            downheap(min);
        }

    }
}
