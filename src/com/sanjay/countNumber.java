package com.sanjay;
import java.util.Scanner;

public class countNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int res = 0;
        while(x>0){
            x=x/10;
            res++;
        }
        System.out.println(res);
    }
}
