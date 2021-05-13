package com.patterns.singlenton;

public class Singlenton {
    public static void main(String [] args) {
        Singelton singelton = Singelton.getInstance();
        singelton.i = 5;
        System.out.println(singelton.i);
    }
}
class Singelton {
    int i = 0;

   static Singelton singelton = new Singelton();

    private Singelton() {

    }

    public static Singelton getInstance() {
        return singelton;
    }
}