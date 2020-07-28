package com.Interface;

public interface Student {
    //dont require to give a body
    static void study()
    {
        System.out.println("hello");
    }
    default void fun()
    {
        System.out.println("aur launde kesa hai");
    }
    void bunk();
    void playpubg();
}
