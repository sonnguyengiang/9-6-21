package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arr[] = {0,9,8,7,6,5,4,3,2,1};
	int x;
	int y = 0;
	Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number that you want remove");
    x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                y = i;
            }
        }
        for (int i = y; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            }
        arr[arr.length - 1] = 0;
        for (int z: arr) {
            System.out.print(z + "\t");
        }
    }
}
