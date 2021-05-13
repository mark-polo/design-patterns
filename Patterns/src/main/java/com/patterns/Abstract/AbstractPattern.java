package com.patterns.Abstract;

/*

    Abstract factory pattern

 */

public class AbstractPattern {
    public static void main(String [] args) {

        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank");
        Car toyota = carFactory.createCar("Toyota");
        Car audi = carFactory.createCar("Audi");
        toyota.drive();
        audi.drive();

        Tank t90 = tankFactory.createTank("T90");
        Tank tiger = tankFactory.createTank("Tiger");
        t90.drive();
        tiger.drive();

    }
}

interface Car {
    void drive();
}

class Toyota  implements Car {

    @Override
    public void drive() {
        System.out.println("drive toyota");
    }
}

class Audi  implements Car {

    @Override
    public void drive() {
        System.out.println("drive audi");
    }
}

class CarFactory implements Factory{
    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }

    public Car createCar (String typeOfCar) {

        switch (typeOfCar) {
            case "Toyota": return new Toyota();
            case "Audi": return new Audi();
            default: return null;
        }
    }
}


interface Tank {
    void drive();
}

class T90  implements Tank {

    @Override
    public void drive() {
        System.out.println("drive T90");
    }
}

class Tiger  implements Tank {

    @Override
    public void drive() {
        System.out.println("drive Tiger");
    }
}

class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank (String typeOfTank) {

        switch (typeOfTank) {
            case "T90": return new T90();
            case "Tiger": return new Tiger();
            default: return null;
        }
    }
}

interface Factory {
    Tank createTank(String typeOfTank);
    Car createCar(String typeOfCar);
}

class AbstractFactory {
    public Factory createFactory (String typeOfFactory) {
        switch (typeOfFactory) {
            case "Tank" : return  new TankFactory();
            case  "Car" : return  new CarFactory();
            default: return null;
        }
    }
}