package com.patterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/*

    Якщо вже є якийсь тип , наприклад , красний ауді , то нащо нам його заново створювати ми його будемо юзати , якщо немає , то ...

    https://www.youtube.com/watch?v=tmBzUYpsxTw&list=PL786bPIlqEjRMh8_H4EBkxXlLis-Ag4na&index=15

 */

public class FlyWeightLesson {
    public static void main(String [] args) {

        FlyWeightGarage flyWeightGarage = new FlyWeightGarage();
        Audi audi = flyWeightGarage.getAudi("red");
        Audi audi1 = flyWeightGarage.getAudi("red");

        System.out.println(audi.color);
    }
}

class Audi {
    String color;
}

class FlyWeightGarage {
    Map<String  , Audi> map = new HashMap<>();

     Audi getAudi(String color) {
         Audi audi = map.get(color);
         if(audi == null) {
             audi = new Audi();
             audi.color = color;
             map.put(color, audi);
         }
         return audi;
     }
}