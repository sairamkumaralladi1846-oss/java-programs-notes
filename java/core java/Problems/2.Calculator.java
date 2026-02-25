package Problems;
import java.util.Scanner;

class  Calculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the inputs");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        int substraction = num1 - num2;
        System.out.println("Substraction: ".concat(String.valueOf(substraction)));
        System.out.println("Division: " +(num1 / num2));
        System.out.println("Float Division : " + ((float) num1 / num2));
        System.out.println("Remainder: " +(num1 % num2));

        input.close();
    }
}