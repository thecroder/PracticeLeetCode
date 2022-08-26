package com.sanjay;
import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();
        int d = 0;
        d = a+b+c;
        System.out.println("Sum = " +d);
    }
}