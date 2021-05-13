package com.patterns.Builder;

public class Builder {
    public static void main(String [] args) {

        sportCar sportCar = new sportCar.Builder("Audi").setColor("Red").setMaxSpeed(300).build();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
        
    }
}

class sportCar {
    private final String name;
    private final String color;
    private final int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    sportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color = "black";
        this.maxSpeed = builder.maxSpeed = 200;
    }

    static class Builder {
        private final String name;
        private String color;
        private int maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public sportCar build() {
            return  new sportCar(this);
        }
    }
}
