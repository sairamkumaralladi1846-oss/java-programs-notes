/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Reads an integer N representing the number of inputs.
    2. Accepts N space-separated integers from the user.
    3. Prints the square of each number in the same order.
    4. Calculates and prints the sum of all entered numbers.

    Input Format:
    -------------
    - First input: Integer N (number of values)
    - Second input: N space-separated integers

    Output Format:
    --------------
    - First line: Squares of the numbers (space separated)
    - Second line: Total sum of the numbers

    Example:
    --------
    Input:
    5
    1 2 3 4 5

    Output:
    1 4 9 16 25
    Total Sum of Numbers: 15
*/



import java.util.Scanner;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of inputs:");
        int n = input.nextInt();
        int sum = 0;
        System.out.println("Enter inputs space seperated");
        for (int i=0;i<n;i++ ){
            int num = input.nextInt();
            sum+= num;
            System.out.print((num*num)+ " ");
        }
        System.out.println();
        System.out.println("Total Sum of Numbers:"+sum);
    }
}
