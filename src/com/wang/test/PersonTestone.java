package com.wang.test;

public class PersonTestone {
    public static void main(String[] args){
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge(); //显示age值
        int newAge = p1.addAge(2);//调用addAge方法给对象age属性添加2岁
        System.out.println(p1.name + "的新年龄为：" + newAge);
        System.out.println(p1.age);

        //******************************************
        Person p2 = new Person();
        p2.showAge(); //打印0
        p2.addAge(10);
        p2.showAge(); //打印10
        p1.showAge(); //打印20

    }

}
