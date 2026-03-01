package com;

import java.sql.SQLOutput;

public class Test {
    public static void main(String args[]) {
        Car MyCar = new Car();
        MyCar.color = "Red";
        MyCar.model = "Dzire";
        System.out.println(MyCar.color);
        MyCar.startCar();
        MyCar.gearUp();
        MyCar.accelerate();


        Car myCar1 = new Car("Blue");
        System.out.println(myCar1.color);
    }
}
