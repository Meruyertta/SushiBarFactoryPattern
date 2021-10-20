package com.company;

public class Philadelphia implements Sushi{
    @Override
    public void taste() {
        System.out.println("Yummi with salmon");
        make();
    }

    @Override
    public void make() {
        System.out.println("Philadelphia is being made");
    }
}
