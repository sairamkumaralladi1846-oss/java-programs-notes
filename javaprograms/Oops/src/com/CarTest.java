package com;

public class CarTest {
    public static void main(String args[]) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Dzire";
        System.out.println(myCar.color);
        myCar.startCar();
        myCar.gearUp();
        myCar.accelerate();


        Car friendCar = new Car("Blue");
        System.out.println(friendCar.color);
        friendCar.model = "Tiago";
        friendCar.startCar();
        friendCar.gearUp();
        friendCar.accelerate();
    }
}
