package com.sanjay;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int k =0;
        int n = sc.nextInt();

        int[] arry = new int[n];
        int[] newarry = new int[n];
        for(int i =0 ; i< n; i++){
            int g= sc.nextInt();
            arry[i] = g;
        }

        for(int j =n-1; j>=0;j--){
            newarry[j]=arry[k];
            k++;
        }
        for(int val:newarry){
            System.out.println(val);
        }
        System.out.println(Arrays.toString(newarry));
    }
}
