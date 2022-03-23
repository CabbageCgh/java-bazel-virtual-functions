package com.example.vf;

public class Runner {

    public static void main(String[] args) {
        Car benz = new Benz(100000);
        Car bmw = new Bmw();

        benz.run();
        bmw.run();
    }

}
