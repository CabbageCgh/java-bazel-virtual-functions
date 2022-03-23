package com.example.vf;

public class Bmw implements Car {

    @Override
    public void run() {
        System.out.println("bmw is running");
    }

    @Override
    public void stop() {
        System.out.println("bmw is stop");
    }

    @Override
    public void color() {
        System.out.println("bmw color is red");
    }
}
