package com;

import java.net.SocketImpl;
import java.net.SocketOption;

public class Car {
    String color;
    String model;
    int price;
    int gear = 0;
    int speed =0;
    Car(){

    }

    Car(String carColor){
        color = carColor;
    }

    void startCar(){
        System.out.println(model + " "+color+" Car has started");
    }
    void gearUp(){
        gear ++;
        System.out.println("Gear Up now the gear at:"+gear);
        accelerate();
    }
    void accelerate(){
        speed += 20;
        System.out.println("Accelerate the car now the speed at:"+speed);
    }
}
