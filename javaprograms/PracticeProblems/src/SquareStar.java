/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Reads an integer N from the user.
    2. Prints a square pattern of stars (*) with N rows and N columns.
    3. Each row should contain exactly N stars.

    Input Format:
    -------------
    - A single integer N representing the number of rows and columns.

    Output Format:
    --------------
    - A square pattern of stars (*) of size N x N.

    Example:
    --------
    Input:
    4

    Output:
    ****
    ****
    ****
    ****
*/




import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select no.of rows in *:");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("*");
//                System.out.print(j);
            }
            System.out.println();
        }
    }
}
