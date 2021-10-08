package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of Arrays");
        int size = input.nextInt();
        int[] array1 = new int[size], array2 = new int[size] ,temp = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of first array ");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the Second Array of Elements: ");
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("Before Swapping");
        System.out.println("First Array");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("Second Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i]);
        }
        for (int i = 0; i < size; i++) {
            temp[i] = array1[i];
            array1[i] = array2[i];
            array2[i] = temp[i];
        }
        System.out.println("\nArrays after Swapping");
        System.out.println("First Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i]);
        }

    }
}
