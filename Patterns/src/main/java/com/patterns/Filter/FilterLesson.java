package com.patterns.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterLesson {
    public static void main(String [] args) {
        CarF carF = new CarF(200, "green", "audi", 4);
        CarF carF2 = new CarF(150, "black", "bmw", 2);
        CarF carF3 = new CarF(300, "green", "bugatti", 2);

        List<CarF> cars = new ArrayList<>();
        cars.add(carF);
        cars.add(carF2);
        cars.add(carF3);

        cars = new SpeedFilter().filter(cars);

        for (CarF car : cars) {
            System.out.println(car.getName());
        }
    }
}

interface CarFilter {
     List<CarF> filter(List<CarF> cars);
}

class SpeedFilter implements CarFilter {

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars) {
            if(car.getMaxSpeed() > 150) {
                list.add(car);
            }
        }
        return list;
    }
}

class CarF {

    public CarF(int maxSpeed, String color, String name, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.name = name;
        this.doors = doors;
    }

    private int maxSpeed;
    private String color;
    private String name;
    private int doors;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
