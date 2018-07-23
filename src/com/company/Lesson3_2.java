package com.company;

import java.util.Scanner;

public class Lesson3_2 {
    public static void main(String[]args){
        System.out.println("Enter the three numbers:");

        System.out.println("Enter number one: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter number two: ");
        int num2 = sc.nextInt();

        System.out.println("Enter number three: ");
        int num3 = sc.nextInt();

        if (num1>num2 & num1>num3){
            System.out.println("Max number is"+num1);
            System.out.println("Min nuber is "+ Math.min(num2,num3));
        }
        else if (num2>num3 & num2>num1) {
            System.out.println("Max number is " + num2);
            System.out.println("Min nuber is " + Math.min(num1, num3));
        }
        else {
            System.out.println("Max number is " + num3);
            System.out.println("Min number is "+ Math.min(num1,num2));
        }

    }
}
