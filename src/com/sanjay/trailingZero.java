package com.sanjay;
import java.util.Scanner;

public class trailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = n;
        for(int i=2;i<n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        int res =0;
        while(fact%10==0){
            res++;
            fact =fact/10;
        }
        System.out.println(res);

    }
}




//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//                long n = sc.nextInt();
//                long fact = n;
//                for(long i= 2; i<n;i++){
//        fact =fact*i;
//        }
//        System.out.println(fact);
//        int res =0;
//        while( fact%10==0 ){
//        res++;
//        fact = fact/10;
//        }
//        System.out.println(res);
////    while(n!=0){
////