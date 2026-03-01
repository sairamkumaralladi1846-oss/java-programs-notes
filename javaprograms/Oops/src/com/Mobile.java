package com;

public class Mobile {
    // Class attribute
    static String category = "Electronics";

    // Instance attributes
    String brand;
    int price;

    // Constructor
    Mobile(String b, int p) {
        brand = b;
        price = p;
    }

    // Instance method (can access both instance & class attributes)
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Category: " + category);
    }

    // Instance method to update attributes
    void setDetails(String b, int p) {
        brand = b;
        price = p;
    }

    // Class method to update class attribute
    static void setCategory(String c) {
        category = c;
        // brand = "Test"; // ❌ ERROR: cannot access instance variable directly
    }

    // Class method trying to show details (needs object parameter)
    static void showDetails(Mobile obj) {
        System.out.println("Brand: " + obj.brand + ", Price: " + obj.price + ", Category: " + category);
    }
}

