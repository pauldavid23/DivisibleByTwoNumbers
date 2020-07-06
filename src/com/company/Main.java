package com.company;
import java.util.Scanner;
public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter first number to be divided:");

        if (s.hasNextInt()) {
            int firstNum = s.nextInt();
            s.nextLine();

            System.out.println("Enter second number that will divide the first number:");

            if (s.hasNextInt()) {
                int secondNum = s.nextInt();
                s.nextLine();

                System.out.println("Enter last number to divide first number:");

                if (s.hasNextInt()) {
                    int thirdNum = s.nextInt();
                    s.nextLine();

                    if (firstNum%secondNum==0 && firstNum%thirdNum==0) {
                        System.out.println(firstNum + "is divible by " + secondNum + " and " + thirdNum);
                    } else if (firstNum%secondNum != 0 && firstNum%thirdNum==0) {
                        System.out.println("Integer " + firstNum + " is not divisible by " + secondNum);
                    } else {
                        System.out.println("Integer " + firstNum + " is not divisible by " + thirdNum);
                    }

                } else {
                    System.out.println("Invalid input!");
                }
                
            } else {
                System.out.println("Invalid input!");
            }
        } else {
            System.out.println("Invalid input! Please use numbers only.");
        }
    }
}
