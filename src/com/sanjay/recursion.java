package com.sanjay;

import java.util.Scanner;

public class recursion {
    static int factorial(int n){
     if(n==0 || n==1){
         return 1;
     }
     else {
             return n* factorial(n-1);
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        System.out.println(factorial(x));
    }
}
