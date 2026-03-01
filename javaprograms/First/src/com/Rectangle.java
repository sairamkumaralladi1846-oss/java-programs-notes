package com;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return this.width;
    }

    void calArea(){
        System.out.println("Area of Rectangle: " + (width * height));
    }

    void sayHello(String name){
        System.out.println("Hello "+name);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 30);
        System.out.println(rect.getWidth());
        rect.calArea();
        rect.sayHello("SaiMadhu");
    }
}
