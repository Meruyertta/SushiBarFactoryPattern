package com.company;

public class TempuraKitchenFactory extends  KitchenFactory{

    @Override
    public Sushi makeSushi() {
        return new Tempura();
    }
}
