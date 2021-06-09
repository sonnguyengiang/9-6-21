package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int arr1[] = new int[5];
        int arr2[] = new int[4];
        int arr3[] = new int[arr1.length + arr2.length];
        while (x < arr1.length) {
            System.out.print("enter elements array1 " + (x + 1) + ": ");
            arr1[x] = scanner.nextInt();
            x++;
        }
        while (y < arr2.length) {
            System.out.print("enter elements array2 " + (y + 1) + ": ");
            arr2[y] = scanner.nextInt();
            y++;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int conut = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[conut] = arr2[i];
            conut++;
        }
        System.out.println("loading....");
        for (int z: arr3) {
            System.out.print(z + "\t");
        }
    }
}
