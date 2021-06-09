package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("enter a Fahrenhei: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit To celsius " + FahrenheitTocelsius(fahrenheit) + "\n");
                    break;
                case 2:
                    System.out.print("enter a Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("celsius To Fahrenheit " + celsiusToFahrenheit(celsius) + "\n");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double FahrenheitTocelsius(double fahrenheit) {
        double felsius = (5.0 / 9) * (fahrenheit - 32);
        return felsius;
    }
}
