package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("nhập số lượng học sinh: ");
        size = scanner.nextInt();
        int arr[] = new  int[size];
        int count = 0;
        int temp = 0;
        while (temp < size) {
            System.out.print("nhập điểm hs " + (temp + 1) + " : ");
            arr[temp] = scanner.nextInt();
            temp++;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > 5) {
                count++;
            }
        }
        System.out.print("sô học sinh đỗ là: " + count );
    }
}
