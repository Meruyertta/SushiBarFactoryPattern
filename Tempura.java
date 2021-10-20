package com.company;

public class Tempura implements Sushi {
    @Override
    public void taste() {
        System.out.println("Fried yummy");
        make();
    }

    @Override
    public void make() {
        System.out.println("Tempura is being made");
    }
}
