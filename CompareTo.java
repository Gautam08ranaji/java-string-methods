package com.example.practice;

public class CompareTo {
    public static void main(String[] args) {
        String s1= "hello, Gautam Rana";
        String s2= "hello, Gautam Rana";
        String s3= "hello, how are you";
        int result = s1.compareTo(s2);
        int result1 = s1.compareTo(s3);

//        System.out.println(s1.compareTo(s2));
        if (result==0){

            System.out.println("s1 and s2 are equal");

        }else {
            System.out.println("not equal");
        }if(result1==0){
            System.out.println("s1 and s3 are equal");

        }else {
            System.out.println("s1 and s3 are not equal");
        }
    }
}
