import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        input.close();
        System.out.println("Sum : " + (num1 + num2));
        System.out.println( "Sum : ".concat((String.valueOf(num1 + num2))));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Multiplication: " +(num1 * num2));
        System.out.println("Division: " +(num1 / num2));
        System.out.println("Float Division: " + (float) num1 / num2);
        System.out.println("Modulus: " + (num1 % num2));



    }
}