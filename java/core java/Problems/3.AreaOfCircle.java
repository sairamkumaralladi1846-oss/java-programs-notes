package Problems;
import java.util.Scanner;
class AreaOfCircle {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    final float CONSTANT_PI = 3.14f;

    double radius = input.nextDouble();
    System.out.println(radius);

    double area = CONSTANT_PI * radius * radius;
    System.out.println("areaOfCircle:"  + area);

    input.close();
    }
}
