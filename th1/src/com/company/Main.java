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
        int i = 0;
        while (i < arr.length) {
            System.out.print("enter element " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("elements is array: ");
        for (int j = 0; j < arr.length; j ++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("\n Revere array:");
        for (int j = 0; j < arr.length / 2; j ++) {
            int temp = arr[j];
            arr[j] = arr [ size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        for (int j =0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
