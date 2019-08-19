package com.wang.day8;

/**
 * 类中属性的使用
 *
 * 属性(成员变量)   VS   局部变量
 * 1.相同点：
 *        1.1定义变量的格式：数据类型 变量名 = 变量值
 *        1.2先声明，后使用
 *        1.3变量都有其对应的作用域
 *
 * 2.不同点：
 *        2.1在类中声明的位置不同
 *        属性：直接定义在类的一对{ }内；(直接在类里面)
 *        局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量；
 *
 *        2.2关于权限修饰符的不同
 *        属性：可以在声明属性时，指明其权限，使用权限修饰符。
 *             常用的权限修饰符：private、public、缺省(如：boolean isMale)、protected   ---->封装性在细说
 *             目前，大家声明属性，都使用缺省就可以了。
 *        局部变量：不可以使用权限修饰符
 *
 *        2.3默认初始化值得情况
 *        属性：类的属性，根据其类型都有默认初始化值。
 *             整型(byte,short,int,long)的默认值是0
 *             浮点型(float,double)的默认值是0.0
 *             字符型(char)的默认值是0 或者'\u0000'
 *             布尔型(boolean)的默认值是false
 *             引用数据类型(类，数组，接口)的默认值是null
 *
 *        局部变量：没有默认初始化值。
 *                意味着，我们在调用局部变量之前，一定要显式赋值。
 *                特别地：形参在调用时，我们赋值即可
 *
 *        2.4在内存中加载的位置不同
 *        属性：加载到堆空间中(目前的属性都是非static)，同时new出来的结构(比如：数组、对象)也加载到堆空间。
 *        局部变量：加载到栈空间中
 *
 *  虚拟机栈：即平时提到的栈结构，我们将局部变量存储在栈结构中；
 *  堆：我们将new出来的结构(比如数组，对象)加载到堆空间中。补充：对象的属性(非static的)加载在堆空间中。
 *  方法区：类的加载信息、常量池、静态域(static结构的)
 *
 */
public class UserTest {
    public static void main(String[] args){
        User u1 = new User();  //u1在栈空间中
        System.out.println(u1.name);  //打印null
        System.out.println(u1.age);   //打印0
        System.out.println(u1.isMale);//打印false

        u1.talk("日语"); //局部变量形参赋值
    }
}

class User{
    //属性(或成员变量)
    String name;
    public int age;
    boolean isMale;

    public void talk(String language) { //language：称作为形参，也属于局部变量(方法形参）talk是方法
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat(){
        String food = "烙饼";  //定义在方法内的变量，也属于局部变量 (显式赋值)
        System.out.println("北方人喜欢吃：" + food);

    }
}
