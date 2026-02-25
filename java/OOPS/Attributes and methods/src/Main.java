class Mobile {
    // Class attribute
    static String category = "Electronics";

    // Instance attributes
    String brand;
    int price;

    // Constructor
    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Instance method (can access both instance & class attributes)
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Price: " + this.price + ", Category: " + category);
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

public class Main {
    public static void main(String[] args) {
        // Create objects
        Mobile redmi = new Mobile("Redmi-C35", 70000);
        Mobile onePlus = new Mobile("OnePlus-10R", 150000);

        // --------- Display Initial Values ---------
        System.out.println("Initial Values:");
        redmi.displayDetails();
        onePlus.displayDetails();

        // --------- Updating Directly ---------
        redmi.brand = "redmi-c15";     // updating instance attribute directly
        redmi.price = 60000;
        Mobile.category = "Gadgets";   // updating class attribute directly

        System.out.println("\nAfter Direct Update:");
        redmi.displayDetails();
        onePlus.displayDetails(); // notice category also changed for m2

        // --------- Updating Using Methods ---------
        onePlus.setDetails("OnePlus-15R", 80000);   // instance method update
        Mobile.setCategory("Smart Devices");    // class method update

        System.out.println("\nAfter Method Update:");
        redmi.displayDetails();
        onePlus.displayDetails();

        // --------- Access Rules Demonstration ---------
        System.out.println("\n--- Access Rules Demonstration ---");
        // Instance method accessing class attribute
        redmi.displayDetails(); // works fine (instance + class attributes)

        // Class method accessing instance attribute
        Mobile.showDetails(redmi); // works ONLY if we pass object
    }
}
