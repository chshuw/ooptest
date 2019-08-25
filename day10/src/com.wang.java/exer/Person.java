package com.wang.java.exer;


/*
 * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 *
 * 2.练习2：
 * 2.1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
 * 2.2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 *
 */
public class Person {

    private int age;
    private String name;

    //注意：最后属性完了之后，就写构造器
    //构造器
    public Person(){
        age = 18;
    }

    public Person(String n, int a){
        name =n;
        age = a;
    }

//    public void setAge(int a){
//        if (a < 0 || a > 130){ //当a小于0或者大于130的时候，可以抛个异常，如下行代码
// //           throw new RuntimeException("传入的数据不合法");
//            System.out.println("传入的数据不合法"); //或者直接打印
//            return;
//        }
//        age = a;
//    }
    //功能和上个setAge一样
    public void setAge(int a){  //设置
        if (a < 0 || a > 130){
            System.out.println("传入的数据不合法");
        }else {
            age = a;
        }
    }

    public int getAge(){  //获取
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }
}
