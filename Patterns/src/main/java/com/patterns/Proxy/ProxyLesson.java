package com.patterns.Proxy;

public class ProxyLesson {
    public static void main(String [] args) {
        CarI car = new CarProxy();
        car.drive();
    }
}

interface CarI {
    void drive();
}

class CarProxy implements CarI {
    CarI car = new Tesla();

    @Override
    public void drive() {
        System.out.println("my proxy car");
        car.drive();
    }
}

class Tesla implements CarI {

    @Override
    public void drive() {
        System.out.println("drive tesla");
    }
}