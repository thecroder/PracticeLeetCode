package com.sanjay;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int g = 0;
        for(int i = 1; i<a;i++){
            if(a%i==0 && b%i==0)
                g=i;
        }
        int lcm = a*b/g;
//        System.out.println(g);
        System.out.println("LCM ="+lcm);
    }
}
