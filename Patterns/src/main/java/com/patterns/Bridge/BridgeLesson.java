package com.patterns.Bridge;

/*

    https://github.com/iluwatar/java-design-patterns/tree/master/bridge


 */

public class BridgeLesson {
    public static void main(String [] args) {

        ICar car = new ToyotaCar(new carBridge());
        car.drive();

    }
}

abstract class ICar {
    IBridge iBridge;

    public ICar(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}
abstract class ITrack {
    IBridge iBridge;

    public ITrack(IBridge iBridge) {
        this.iBridge = iBridge;
    }

    public abstract void drive();
}

interface IBridge { void drive(); }

class carBridge implements IBridge {
    @Override
    public void drive() {
        System.out.println("drive car");
    }
}
class trackBridge implements IBridge {
    @Override
    public void drive() {
        System.out.println("drive track");
    }
}

class ToyotaCar extends ICar {

    public ToyotaCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive car toyota ");
    }
}

class AudiCar extends ICar {

    public AudiCar(IBridge iBridge) {
        super(iBridge);
    }

    @Override
    public void drive() {
        System.out.println("drive car audi ");
    }
}