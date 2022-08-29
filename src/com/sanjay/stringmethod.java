package com.sanjay;
import java.util.Locale;
import java.util.Scanner;
public class stringmethod {
    public static void main(String[] args){
        String name = "Sanjay";
//        System.out.println(name);

        int value = name.length();
        System.out.println(value);
//
//        String small = name.toLowerCase();
//        System.out.println(small.trim());

//        String big = name.toUpperCase();
//        System.out.println(big.trim());

//        System.out.println(name.substring(2,3));
//       System.out.println(name.replace('n','j'));
//        System.out.println(name.replace("s","man"));
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("ay"));
        System.out.println(name.charAt(3));


        System.out.println(name.indexOf("an"));
        System.out.println(name.lastIndexOf("a",3));
        System.out.println(name.equals("Sanjay"));
        System.out.println(name.equalsIgnoreCase("sanjay"));
        System.out.println(name.toLowerCase());

    }
}
