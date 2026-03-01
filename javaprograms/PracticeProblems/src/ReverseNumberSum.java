/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Reads an integer number from the user.
    2. Reverses the digits of the number.
    3. Calculates the sum of its digits.
    4. Prints the sum of digits.
    5. Prints the reversed number.

    Input Format:
    -------------
    - A single integer entered by the user.

    Output Format:
    --------------
    - First line: Sum of digits of the number
    - Second line: Reversed number

    Example:
    --------
    Input:
    1234

    Output:
    1

 */

import java.util.Scanner;
public class ReverseNumberSum {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String rev = "";
        int sum = 0;
         while (num > 0){
             sum += num % 10;
             rev += (num % 10);
             num = num/10;
         }

        System.out.println(sum);
        System.out.println(rev);
    }
}
