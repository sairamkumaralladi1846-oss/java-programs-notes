/*
    Problem Statement:
    ------------------
    Write a Java program that:

    1. Takes an integer array.
    2. Sorts the array in ascending order using Bubble Sort algorithm.
    3. Returns the sorted array.
    4. Prints the sorted array.

    Algorithm Used:
    ---------------
    Bubble Sort

    Logic:
    ------
    - Compare adjacent elements.
    - Swap them if they are in the wrong order.
    - Repeat the process for all elements.
    - After each pass, the largest element moves to the end.
    - Continue until the array is fully sorted.

    Input:
    ------
    int[] array = {1, 3, 10, 5, 2, 4};

    Output:
    -------
    [1, 2, 3, 4, 5, 10]

    Time Complexity:
    ----------------
    - Worst Case: O(n²)
    - Best Case: O(n²)  (since no optimization flag is used)

    Space Complexity:
    -----------------
    - O(1) (In-place sorting)
*/


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1,3,10,5,2,4};
        int[] reqArray = sortArray(array);
        System.out.println(Arrays.toString(reqArray));
    }

    static int[] sortArray(int[] array){
        for (int i= 0; i < array.length-1; i++){
            for (int j=0; j < array.length-1 -i ; j++){
                int start = array[j];
                int next = array[j+1];
                if (start > next){
                    array[j] = next;
                    array[j+1] = start;
                }
            }
        }
        return array;
    }
}
