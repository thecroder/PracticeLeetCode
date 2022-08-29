package com.sanjay;
import java.util.Scanner;

public class conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // question 1
//        int a = 11;
//
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I Am not 11");
//        }
        // question 2
        System.out.println("Enter your percentage");
        int marks = sc.nextInt();

        switch (marks){
            case 1 : marks = 10;
                System.out.println("pass");
                break;
            default:
                System.out.println("Error");

        }

    }
}
