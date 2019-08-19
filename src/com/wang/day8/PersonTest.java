package com.wang.day8;

/**
 * 属性=成员变量=field=域、字段：对应类中的成员变量；
 * 行为=方法=成员方法=函数=method：对应类中的成员函数(成员方法)。
 * 定义类,其实就是定义类中的成员（成员变量和成员函数）
 * 创建类的对象=类的实例化=实例化类
 *
 * 二、类和对象的使用（面对对象思想落地的实现）,三个步骤：
 *    1.创建类、设计类的成员
 *    2.创建类的对象(类的实例化)
 *    3.通过"对象名.属性"或"对象名.方法"调用对象的结构
 *  java类及类的成员(如何使用java类)—>进行java类的实例化，即创建类的对象
 *
 * 三、如果创建了一个类的多个对象，则每个对象都有独立的拥有一套类的属性。(非static)
 *    意味着:如果我们修改一个对象的属性a,则不影响另外一个对象属性a的值
 *
 * 四、对象的内存解析
 *
 */


public class PersonTest {
    public static void main(String[] arge) {
        //2.创建类的对象p1(创建Person类的对象)
        //左边的Person是一个变量数据类型，p1是变量名，new Person()是变量值
        Person p1 = new Person();

        //3.调用对象的结构：属性、方法
        //调用属性："对象名.属性"
        p1.name = "Tom";  //变量赋值
        p1.isMale = true;
        System.out.println(p1.name); //调用变量的值

        //调用方法："对象名.方法"
        p1.eat();
        p1.sleep();
        p1.talk("Chinese"); //Chinese传递给talk()方法中的language


        //****************************************************
        Person p2 = new Person();
        System.out.println(p2.name);  //打印null
        System.out.println(p2.isMale);  //打印false

        //****************************************************
        //将p1变量保存的对象地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体。
        Person p3 = p1;
        System.out.println(p3.name); //打印Tom  调的p3就是相当于调的p1

        p3.age = 10;   //修改p3,实际上就是修改的p1,因此，打印出10来
        System.out.println(p1.age); //打印10

    }
}


//1.创建类、设计类的成员(人的类（抽象的))
class Person {

    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话，使用的是：" + language);
    }


}
