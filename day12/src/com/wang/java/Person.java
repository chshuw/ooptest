package com.wang.java;

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance){
        System.out.println("走路,走的距离是：" + distance + "公里");
        show();
        eat();
    }

    private void show(){  //子类不能重写父类中声明为private权限的方法
        System.out.println("我是一个人");
    }

    public Object info(){ //父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
        return null;
    }
//
//    public double info1(){
//        return 1.0;
//    }
}
