package com.example.practice;

public class StartsWith {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println(myStr.startsWith("Hel"));   // true
        System.out.println(myStr.startsWith("llo"));   // false
        System.out.println(myStr.startsWith("o"));     // false
        System.out.println(myStr.startsWith("H"));     // true
    }
}
