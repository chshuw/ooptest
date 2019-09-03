package com.wang.java2;

public class Student extends Person {

    String major;
    int id = 1002; //学号

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public Student(String name, int age, String major){
        super(name,age); //调的父类中指定参数的构造器  public Person(String name,int age){ }
        this.major = major;
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("学生应该多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生学习知识");
        eat();  //省略了this.eat  子类的方法
        super.eat(); //父类的方法
    }

    public void show(){  //name和age来自父类
        System.out.println("name = " + name + ", age = " + age);
        System.out.println("id = " + id);  //子类的id,或者写this.id
        System.out.println("id = " + super.id);  //父类的id
    }
}
