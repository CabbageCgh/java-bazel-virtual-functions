package com.example.vf;

public class Benz implements Car {

    private final int price;

    public Benz(int price) {
        this.price = price;
    }

    @Override
    public void run() {
        System.out.println("benz is running");
    }

    @Override
    public void stop() {
        System.out.println("benz is stop");
    }

    @Override
    public void color() {
        System.out.println("benz color is yellow");
    }
}
