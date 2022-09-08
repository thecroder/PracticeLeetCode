package com.sanjay;
import java.util.Scanner;
public class array_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the elements");
        int n = sc.nextInt();
        int array[] = new int[10];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Elements in the array are");
        for (int i=n; i>0;i--){
            System.out.println(array[i]);
        }


    }
}
