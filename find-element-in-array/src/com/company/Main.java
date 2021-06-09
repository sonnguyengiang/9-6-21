package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String arr[] = {"minh","huy","thanh","bao","viet","hai","hoang","chung"} ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter someone name that you want find: ");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(input_name)) {
                System.out.println(" Position of the students in the list: " + input_name + " is: " + (i+1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }
}
