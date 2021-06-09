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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("enter a number in: [" + i + " , " + j + "] : " );
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mảng gồm: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("nhập vị trí cột muốn cộng: ");
        int index = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (index == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("tổng cột " + index + " là: " + sum);
    }
}
