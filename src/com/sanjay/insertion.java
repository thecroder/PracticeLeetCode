package com.sanjay;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];

        System.out.println("Enter the elements");
        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the position at which element is supposed to be inserted");
        int m = sc.nextInt();

        System.out.println("Elements are:");
        for(int i =0; i<a.length;i--){
            System.out.println(b[i]);
        }

    }
}
