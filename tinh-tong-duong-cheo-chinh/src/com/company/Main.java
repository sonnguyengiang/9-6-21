package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        System.out.print("nhập số dòng và cột của mảng: ");
        m = scanner.nextInt();
        int arr[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("nhập [" + i + "," + j + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mảng a gồm: ");
        for (int i =0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i =0; i < m; i++) {
            sum += arr[i][i];
        }
        System.out.print("tổng đường chéo chính là: " + sum);
    }
}
