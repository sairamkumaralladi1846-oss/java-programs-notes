/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Reads an integer N from the user.
    2. Prints a right-angled triangle star (*) pattern.
    3. The triangle should contain N rows.
    4. In each row i, print i number of stars.

    Input Format:
    -------------
    - A single integer N representing the number of rows.

    Output Format:
    --------------
    - A right-angled triangle pattern of stars.

    Example:
    --------
    Input:
    5

    Output:
    *
    **
    ***
    ****
    *****
*/



import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = input.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
