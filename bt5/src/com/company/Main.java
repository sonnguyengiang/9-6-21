package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("nhập chiều dài mảng: ");
        size = scanner.nextInt();
        int arr[] = new int[size];
        int a = 0;
        while (a < arr.length) {
            System.out.print("enter elements " + (a + 1) + ": ");
            arr[a] = scanner.nextInt();
            a++;
        }
        int min = arr[0];
        System.out.println("array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("min is: " + min);
    }
}
