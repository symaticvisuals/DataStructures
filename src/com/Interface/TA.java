package com.Interface;

public class TA implements Teacher,Student{
    @Override
    public void bunk() {
        System.out.println("mai nhi jaunga");
    }

    @Override
    public void playpubg() {
        System.out.println("mai khelunga");

    }

    @Override
    public void study() {
        System.out.println("padhna pdega");

    }

    @Override
    public void teach() {
        System.out.println("padhana pdega");

    }

    @Override
    public void guide() {
        System.out.println("guide");

    }
}

