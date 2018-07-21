package com.company;

import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[]args){
        System.out.println("Enter the time:");
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if (time>9 & time <18){
            System.out.println("You are at work");
        }
        else System.out.println("I have a rest");
    }
}
