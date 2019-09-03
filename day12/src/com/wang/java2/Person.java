package com.wang.java2;

public class Person {
    String name;
    int age;
    int id = 1001; //学号

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this(name);  //代表public Person(String name){ }构造器
        this.age = age;
    }

    public void eat(){
        System.out.println("人：吃饭");
    }

    public void walk(){
        System.out.println("人：走路");
    }
}
