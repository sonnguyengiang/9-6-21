package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        int x;
        int index;
        System.out.println("enter a number: ");
        x = scanner.nextInt();
        do {
            System.out.println("enter index;");
            index = scanner.nextInt();
        } while (index < 1 || index > arr.length - 1);
        abc(x,index, arr);
    }
    public static void abc(int x, int index, int[] arr){
        arr[index - 1] = x;
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("loading....");
        for (int z : arr) {
            System.out.print(z + "\t");
        }
    }
}
