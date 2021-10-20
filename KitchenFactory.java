package com.company;

public abstract class KitchenFactory {

    public void prepareSushi(){
        Sushi okSushi=makeSushi();
        okSushi.taste();
    };
    public abstract Sushi makeSushi();
}
