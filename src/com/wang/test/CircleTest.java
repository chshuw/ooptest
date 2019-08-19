package com.wang.test;

public class CircleTest {
    public static void main(String[] args){

        Circle c1 = new Circle();

        c1.radius = 2.1;

        //对应的方法一：
//        double area = c1.findArea();   //接收一个变量area
//        System.out.println(area);

        //对应的方法二：
        c1.findArea();


    }
}

class Circle{

    //属性
    double radius; //半径

    //求圆的面积
    //方式一：有返回值
//    public double findArea(){
//        double area = Math.PI * radius * radius;
//        return area;
//    }

    //方式二：没有返回值
    public void findArea(){
        double area = Math.PI * radius * radius;
        System.out.println("面积为：" + area);
    }
}
