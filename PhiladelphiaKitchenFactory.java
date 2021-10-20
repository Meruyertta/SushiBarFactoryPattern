package com.company;

public class PhiladelphiaKitchenFactory extends KitchenFactory {

    @Override
    public Sushi makeSushi() {
        return new Philadelphia();
    }
}
