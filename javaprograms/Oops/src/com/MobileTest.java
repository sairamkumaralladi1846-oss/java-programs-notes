package com;

public class MobileTest {
        public static void main(String[] args) {
            // Create objects
            Mobile m1 = new Mobile("Samsung", 70000);
            Mobile m2 = new Mobile("Apple", 150000);

            // --------- Display Initial Values ---------
            System.out.println("Initial Values:");
            m1.displayDetails();
            m2.displayDetails();

            // --------- Updating Directly ---------
            m1.brand = "OnePlus";     // updating instance attribute directly
            m1.price = 60000;
            Mobile.category = "Gadgets";   // updating class attribute directly

            System.out.println("\nAfter Direct Update:");
            m1.displayDetails();

            m2.displayDetails(); // notice category also changed for m2

            // --------- Updating Using Methods ---------
            m2.setDetails("Google Pixel", 80000);   // instance method update
            Mobile.setCategory("Smart Devices");    // class method update

            System.out.println("\nAfter Method Update:");
            m1.displayDetails();
            m2.displayDetails();

            // --------- Access Rules Demonstration ---------
            System.out.println("\n--- Access Rules Demonstration ---");
            // Instance method accessing class attribute
            m1.displayDetails(); // works fine (instance + class attributes)

            // Class method accessing instance attribute
            Mobile.showDetails(m1); // works ONLY if we pass object
        }
}
