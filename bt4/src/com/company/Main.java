package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.print("nhập số cột: ");
        m = scanner.nextInt();
        System.out.print("nhập số dòng: ");
        n = scanner.nextInt();
        int arr[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr [ " + i +" , " + j + " ] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        System.out.println("ma trận gồm: ");
        for (int i =0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("số lớn nhất là: " + max);
    }
}
