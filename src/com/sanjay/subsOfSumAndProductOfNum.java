package com.sanjay;
import java.util.Scanner;

public class subsOfSumAndProductOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int subs = 0;
        while(n>0){
            product = product * (n%10);
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.println(product - sum);
    }
}
