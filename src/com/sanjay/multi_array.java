package com.sanjay;

public class multi_array {
    public static void main(String[] args){
        int[][] flats;// 2-d array
        flats = new int[2][2];
        flats[0][0] = 12;
        flats[0][1] = 54;
        flats[1][0] = 42;
        flats[1][1] = 22;
        for(int i=0;i< flats.length;i++){
            for(int j=0; j < flats[i].length; j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");
        }
    }
}


