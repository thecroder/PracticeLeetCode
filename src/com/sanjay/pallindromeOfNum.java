package com.sanjay;
import java.util.Scanner;

public class pallindromeOfNum{
    public static void main(String[] args){
        System.out.println("Enter the element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pall(n));
    }
    public static boolean pall(int n){
        int rev=0;
        int temp = n;
        while(temp!=0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }
        return (rev==n);
    }
}

//package com.sanjay;
//import java.util.Scanner;
//
//public class pallindromeOfNum {
//
//    public static boolean pall(int n){
////        System.out.println("Enter the number");
//        int rev = 0;
//        int temp = n;
//        while(temp!=0){
//            int ld = temp%10;
//            rev = rev*10+ld;
//            temp =temp/10;
//        }
//        return(rev==n);
//
//
////        int no=number;
////        int ans =0;
////        while(no != 0){
////            int g = no%10;
////            ans = ans *10 +g;
////            no /=10;
////        }
////       return (ans == number);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        System.out.print(pall(n));
////
////
//    }
//}
