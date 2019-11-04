package com.wang.java.java1;

/*
 * 面向对象的特征一：封装与隐藏     3W:what? why? how?
 * 一、问题的引入：
 *  当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。这里，赋值操作要受到
 *  属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。但是，在实际问题中，我们往往需要给属性赋值
 *  加入额外的限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。（比如：setLegs()）
 *  同时，我们需要避免用户再使用"对象.属性"的方式对属性进行赋值。则需要将属性声明为私有的(private).
 *  -->此时，针对于属性就体现了封装性。
 *
 * 二、封装性的体现：
 * 封装性的设计思想：把该隐藏的隐藏起来，该暴露的暴露出来
 * 我们将类的属性xxx私有化(private),同时，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值
    拓展：封装性的体现：① 私有化  ② 不对外暴露的私有的方法  ③ 单例模式   ...
 *
 *
 * 三、封装性的体现，需要权限修饰符来配合。
 * 1.Java规定的4种权限（从小到大排列）：private、缺省(default)、protected 、public
 * 2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *        修饰类的话，只能使用：缺省、public
 *
 * 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小。
 *
 */

public class AnimalTest {
    public static void main(String[] args){

        Animal a = new Animal();
        a.name = "大黄";  //赋值
//        a.age = 1;
//        a.legs = 4;

        a.eat();
        a.show();

 //       a.legs = -4;
 //       a.setLegs(6);
        a.setLegs(-6);//调方法赋值
        a.show();
    }

}

//缺省(default)的
class Animal{
    String name;
    private int age;
    private int legs; //腿的个数

    /**
     * 对legs属性的封装（对属性的设置）
     * @param l
     */
    public void setLegs(int l){ //赋值
        if (l >= 0 && l % 2 == 0){  //l大于等于0并且是偶数，才允许l赋值给legs
            legs = l;
        }else {
            legs = 0;
//            抛出一个异常（暂时没有讲）
        }
    }

    /**
     * 对属性(值)的获取
     * @return
     */
    public int getLegs() {
        return legs;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
    }

    //提供关于属性age的get和set方法

    public int getAge() { //有返回值，没有形参
        return age;
    }

    public void setAge(int a) { //set设置(带着东西去)，要有形参，没有返回值
        age = a;
    }
}
