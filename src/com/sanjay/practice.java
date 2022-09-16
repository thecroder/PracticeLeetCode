package com.sanjay;
import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while(n>0){
           int pop = n%10;
         rev = rev*10 + pop;
            n = n/10;
        }
//        if(n==rev)
        System.out.print(rev);
        {
            if (rev == n) {
                System.out.println("Pallindrome");
            } else {
                System.out.println("Not Pallindrome");
            }
        }
    }
}
