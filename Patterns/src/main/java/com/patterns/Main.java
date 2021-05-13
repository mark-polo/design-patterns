package com.patterns;

public class Main {
    public static void main(String [] args) {

        Number number = new Number();

        number.setOne(10);
        number.setTwo(2);

        int c = number.getOne() + number.getTwo();

        System.out.println(c);
    }
}

class  Number {
    private int one;
    private  int two;

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        if(one >= 0) {
            this.one = one;
        } else {
            this.one = 0;
            System.out.println("Error one");
        }
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        if(two >= 0) {
            this.two = two;
        } else {
            this.two = 0;
            System.out.println("Error two");
        }
    }
}