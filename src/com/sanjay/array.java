package com.sanjay;

import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store.");
        int n = sc.nextInt();

        int[] array = new int[10];
        for (int i = 0; i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i= 0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
