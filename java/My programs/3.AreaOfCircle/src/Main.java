import java.util.Scanner;
class Main{
    public static void main(String[]args){
        final double CONSTANT_PI = 3.14;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        double area = CONSTANT_PI * radius * radius;
        System.out.println("The area of the circle is:" + area);

        input.close();
    }
}