package com.wang.age;

public class AgeTest {
    public static void main(String[] args){
        String party = "1995-8-14";
        int age = AgeUtils.getAge(party);
        System.out.println(age);
    }
}
