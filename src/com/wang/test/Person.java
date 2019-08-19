package com.wang.test;

public class Person {

    String name;
    int age;
    /**
     * 1代表男性
     * 0代表女性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age:" + age); //在方法当中调属性age
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
