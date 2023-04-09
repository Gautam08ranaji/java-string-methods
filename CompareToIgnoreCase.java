package com.example.practice;

public class CompareToIgnoreCase {
    public static void main(String[] args) {
        String s1 = "i am proficient in java";
        String s2 = "I AM PROFICIENT IN JAVA";
        int s3 = s1.compareToIgnoreCase(s2);

        if (s3 == 0) {
            System.out.println("case ignored");
        } else {
            System.out.println("not same");
        }
    }
}
