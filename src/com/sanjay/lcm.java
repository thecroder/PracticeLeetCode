package com.sanjay;
import java.util.Scanner;

public class lcm {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int n = Math.max(a, b);
        while(true) {
            if (n % a == 0 && n % b == 0) {
                System.out.println(n);
                n++;
            }
            System.out.println(n);
        }
    }
}
