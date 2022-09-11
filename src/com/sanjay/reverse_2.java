package com.sanjay;
import java.util.Arrays;
import java.util.Scanner;

public class reverse_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i =0; i<n;i++) {
            int g = sc.nextInt();
            a[i] = g;
        }
        int s =0;
        int e =n-1;

        while(s<=e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(a));

    }
}
