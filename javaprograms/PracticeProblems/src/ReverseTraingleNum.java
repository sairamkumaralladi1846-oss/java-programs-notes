/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Reads an integer N from the user.
    2. Prints a reverse number triangle pattern.
    3. The pattern starts from N and decreases by one row each time.
    4. In each row, print numbers from current row value down to 1.

    Input Format:
    -------------
    - A single integer N.

    Output Format:
    --------------
    - A reverse number triangle pattern.

    Example:
    --------
    Input:
    5

    Output:
    54321
    4321
    321
    21
    1
*/

import java.util.Scanner;

public class ReverseTraingleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();

        for (int i = n; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
