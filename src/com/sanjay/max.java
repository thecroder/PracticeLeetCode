package com.sanjay;
import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements ");
        int n = sc.nextInt();
        int max = 0;
        int a[]=new int[n];
        for(int i =0;i<n;i++){
            int g = sc.nextInt();
            a[i]=g;
        }
        for(int j=1;j<n;j++){
            if(a[j-1]<a[j]){
                max = a[j];
            }

        }
        System.out.println(Arrays.toString(a));
        System.out.println(max);
    }
}
