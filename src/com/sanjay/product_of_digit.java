package com.sanjay;
import java.util.Scanner;

public class product_of_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int product = 1;
        while(n>0){
            product = product * (n%10);
            n = n/10;
        }
        System.out.println(product);
    }
}
