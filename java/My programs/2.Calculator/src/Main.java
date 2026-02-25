import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = input.nextInt();
        System.out.println("Sum:" + (num1 + num2));
        System.out.println("Difference:" + (num1 - num2));
        System.out.println("Quotient:" + (num1 / num2));
        System.out.println("Real Quotient:" + (float)(num1 / num2));
        System.out.println("Remainder:" +(num1 % num2));

        input.close();
    }
}