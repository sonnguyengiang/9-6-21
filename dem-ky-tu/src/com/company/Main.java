package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập ký tự: ");
        String arr[] = {"a","b","c","d","e","a","a","c"};
        String index = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(index)) {
                count++;
            } else {
                continue;
            }
        }
        System.out.println("số lần " + index + " hiện thị trong mảng là: " + count);
    }
}
