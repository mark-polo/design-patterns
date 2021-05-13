package com.patterns.Factory;

public class FactoryPattern {
    public static void main(String [] args) {
//        Factory factory = new Factory();
//        Car toyota =  factory.create("Toyota");
//        Car audi =  factory.create("Audi");
//
//        toyota.drive();
//        audi.drive();
    }
}
interface Car {
    void drive();
}

class Toyota  implements  Car{

    @Override
    public void drive() {
        System.out.println("drive toyota");
    }
}

class Audi  implements  Car{

    @Override
    public void drive() {
        System.out.println("drive audi");
    }
}

class CarFactory {
    public Car create (String typeOfCar) {

        switch (typeOfCar) {
            case "Toyota": return new Toyota();
            case "Audi": return new Audi();
            default: return null;
        }
    }
}