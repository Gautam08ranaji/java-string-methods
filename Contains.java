package com.example.practice;

//import java.lang.String;

public class Contains {

    public static void main(String[] args) {
        Contains("Rana");


    }
    public static String  Contains(String s1) {
        String text = "hey this is gautam rana and today we are  going to learn an string method called 'CONTAINS'";
       // by print
        System.out.println(text.contains("gautam"));

        //by method
        if (text.contains(s1)){
            System.out.println(text);
        }else{
            System.out.println(s1);
        }
    return s1;
    }
}
