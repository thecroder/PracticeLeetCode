package com.sanjay;

public class linear_search {
    public static void main(String[] args){
        int a[]={43,45,211,34};
        int x = 43;
        boolean flag =false;
        for(int i = 0; i<a.length;i++){
            if(x==a[i]){
                System.out.println("Present");
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Not Present");
        }

//        boolean isInArray = false;
//        for(int element : a){
//            if(element == x){
//                isInArray = true;
//                System.out.println("Present");
//            }
//            else{
//                System.out.println("Not Present");
//            }
//        }
    }
}
