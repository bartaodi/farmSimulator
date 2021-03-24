package com.codecool.farm.animal;

public abstract class Animal {
    private String name;
    protected int size = 0;

    public int getSize() {
        return size;
    }

    public void feed() {}

    public String getName() {
        return name;
    }


}
