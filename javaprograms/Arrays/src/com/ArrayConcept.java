package com;
import javax.sound.midi.Soundbank;
import java.util.Scanner;


class ArrayConcept{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];

        for (int i=0; i<arraySize; i++){
            System.out.println("Enter "+i+" Element:");
            array[i] = input.nextInt();
        }

        for (int i=0; i<arraySize; i++){
            System.out.println(i +" Element in Array is: " + array[i]);
        }

    }
}