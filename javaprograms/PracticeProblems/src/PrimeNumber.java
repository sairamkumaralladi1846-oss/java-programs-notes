/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Reads an integer N from the user.
    2. Checks whether the given number is a prime number.
    3. Returns true if the number is prime, otherwise false.
    4. Prints the result.

    Note:
    -----
    A prime number is a number greater than 1 that has only two factors:
    1 and itself.

    Input Format:
    -------------
    - A single integer N.

    Output Format:
    --------------
    - Print whether the given number is prime or not (true/false).

    Example 1:
    ----------
    Input:
    7

    Output:
    Given Number IS PrimeNumber: true

    Example 2:
    ----------
    Input:
    10

    Output:
    Given Number IS PrimeNumber: false
*/

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = input.nextInt();

        for (int i=2; i<=n; i++){
            boolean isPrime = isPrimeNumber(i);
            if (isPrime) {
                System.out.print(i + " ");
            }

        }
    }

    static boolean isPrimeNumber(int n){

        if (n < 2){
            return false;
        }

//        for (int num = 2; num < n/2; num++){
//            if (n % num == 0){
//                return false;
//            }
//        }

        for (int num = 2; num <= Math.sqrt(n); num++){
            if (n % num == 0){
                return false;
            }
        }
        return true;

    }




}
