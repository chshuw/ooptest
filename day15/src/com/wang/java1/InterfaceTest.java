package com.wang.java1;

/*
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 *
 * 		3.1 JDK7及以前：只能定义全局常量和抽象方法
 * 			>全局常量：public static final的.但是书写时，可以省略不写
 * 			>抽象方法：public abstract的
 *
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法（暂略）
 *
 * 4. 接口中不能定义构造器的！也就是意味着接口不可以实例化
 *
 * 5. Java开发中，接口通过让类去实现(implements)的方式来使用.
 *    如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *    如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *
 * 6. Java类可以实现多个接口   --->弥补了Java单继承性的局限性
 *   格式：class AA extends BB implements CC,DD,EE
 *
 * 7. 接口与接口之间可以继承，而且可以多继承
 *
 * *******************************
 * 8. 接口的具体使用，体现多态性
 * 9. 接口，实际上可以看做是一种规范
 *
 * 面试题：抽象类与接口有哪些异同？
 *
 */
public class InterfaceTest {
    public static void main(String[] args){
        System.out.println(Flyable.MAX_SPEED);  //静态的，可以直接调
        System.out.println(Flyable.MIN_SPEED);

        //通过实现类就实例化
        Plane p = new Plane();
        p.fly();
        p.stop();
    }
}

//接口(JDK7及以前版本)
interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900; //第一宇宙速度
    int MIN_SPEED = 1; //最慢速度， 省略了public static final

    //抽象方法
    public abstract void fly();
    void stop();  //省略了public abstract
}

//如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("停下来了");
    }
}

//如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }

//    @Override
//    public void stop() {
//
//    }
}

interface Attackabel{
    void attack();
}


//java类可以实现多个接口,同时要实现接口中的所有抽象方法
class Buttet extends Object implements Flyable,Attackabel{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}