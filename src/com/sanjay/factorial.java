package com.sanjay;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        long res = n;
//        for(long i=2;i<n;i++){
//            res = res*i;
//        }
//        System.out.println(res);
       int ans = factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int h){
        if(h<2){
            return h;
        }
        return h * factorial(h-1);
    }
}
