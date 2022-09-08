package com.sanjay;

import java.util.Scanner;

public class insertion {
    public static int main(String[] args){
        int[] arr = {34,43,23,54};
        System.out.println("Enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 23;
        for(int i = 0; i<n;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
