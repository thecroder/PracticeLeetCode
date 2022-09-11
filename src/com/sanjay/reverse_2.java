package com.sanjay;
import java.util.Arrays;
import java.util.Scanner;

public class reverse_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int k =0;
        int n = sc.nextInt();
        int a[] = new int[n];
        int ab[] = new int[n];
        for(int i =0; i<n;i++){
            int g = sc.nextInt();
            a[i] = g;
        }
        for(int j=n-1;j>=0;j--){
            ab[j]=a[k];
            k++;
        }
        for(int var:ab){
            System.out.print(var + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ab));

    }
}
