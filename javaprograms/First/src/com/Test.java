package com;
import com.flm.Test2;
//import com.*;
import com.flm.Test3;

public class Test {
    int a = 10;
    int b= 20;
    String c = "Hi";

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        sum();
        Test2.connectToDB();
        Test3.order();
        Test4.addingToCart();
    }
    static void sum(){
        System.out.println(1+2);
    }
}
