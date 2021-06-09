package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,9};
    int index = minValue(arr);
        System.out.println("min is: " + arr[index]);
    }
    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
