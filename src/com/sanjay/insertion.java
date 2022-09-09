package com.sanjay;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args){
        int[] arr = {34,43,23,54};
        int x = 40;
        boolean isInArray = false;
        for(int element : arr){
            if(element == x){
                isInArray = true;
                System.out.println("Present");
            }
            else{
                System.out.println("Not Present");
            }
        }
    }
}
