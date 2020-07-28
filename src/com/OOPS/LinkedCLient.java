package com.OOPS;

public class LinkedCLient {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertlast(1);
        list1.insertlast(5);
        list1.insertlast(6);

        list1.insertlast(2);
        list1.insertlast(7);
        list1.insertlast(8);


        list1.divide_oddeven();
        list1.display();

    }
}
