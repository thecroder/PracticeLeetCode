package com.sanjay;

import java.util.Scanner;

public class lcm2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int n =1;
        for (int i = 0 ; i <= n ; i++){
//        while(n>0){
            if(n%a==0 && n%b==0){
                break;
            }
            else{
                n = a*b;
            }
            n++;

        }
        System.out.println(n);
    }
}
