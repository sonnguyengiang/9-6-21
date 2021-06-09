package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("not more than 20");
            }
        } while (size > 20);
        arr = new int[size];
        for ( int i = 0; i < size; i++) {
            System.out.print("enter element in " +(i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = 0;
        for (int x: arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("\n biggest number is: " + max);
    }
}
