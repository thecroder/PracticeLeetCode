package com.sanjay;
import java.util.Scanner;

public class number{
    public static boolean main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        if(x==0){
            return true;
        }

        if(x<0 || x%10==0){
            return false;
        }


        int reversed_int = 0;
        while(x>reversed_int){
            int pop = x%10;
            x/=10;

        reversed_int = (reversed_int * 10) + pop;
        }
        if (x== reversed_int||x==reversed_int/10){
            return true;
        }
        else{
            return false;
        }

    }
}