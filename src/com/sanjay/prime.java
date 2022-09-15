package com.sanjay;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n==1)
            System.out.println(b1);
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                System.out.println(b1);
        break;}
        System.out.println(b2);
    }
}
