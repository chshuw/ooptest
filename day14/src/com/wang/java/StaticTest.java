package com.wang.java;

/*
   变量分为属性和局部变量。

 * static关键字的使用
 *
 * 1.static:静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类等结构
 *
 * 3.使用static修饰属性：静态变量（或类变量或属性）
 * 		3.1 属性(静态变量)，按是否使用static修饰，又分为：静态属性  vs 非静态属性(实例变量)
 * 		   实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象中的
 *              非静态属性时，不会导致其他对象中同样的属性值的修改。
 *       静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致
 *              其他对象调用此静态变量时，是修改过了的。
 * 		3.2 static修饰属性的其他说明：
 * 			① 静态变量随着类的加载而加载。可以通过"类.静态变量"的方式进行调用
 *          ② 静态变量的加载要早于对象的创建。
 *          ③ 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。
 *
 *          ④		类变量	实例变量
 *          类		yes		no(不能通过类调用实例变量)
 *          对象		yes		yes
 *
 *      3.3 静态属性举例：System.out; Math.PI;
 *
 * 4.使用static修饰方法：静态方法
 * 		① 随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
 * 		②			静态方法	非静态方法
 *          类	  yes(可以调)		no(不可以调)
 *          对象		yes		yes
 * 		③ 在静态方法中，只能调用静态的方法或属性
 *        在非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 *
 * 5. static注意点：
 *    5.1 在静态的方法内，不能使用this关键字、super关键字
 *    5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解。
 *
 * 6. 开发中，如何确定一个属性是否要声明为static的？
 * 		> 属性是可以被多个对象所共享的，不会随着对象的不同而不同的。
 * 		> 类中的常量也常常声明为static
 *
 *    开发中，如何确定一个方法是否要声明为static的？
 *    	> 操作静态属性的方法，通常设置为static的
 *      > 工具类中的方法，习惯上声明为static的。 比如：Math、Arrays、Collections
 */
public class StaticTest {

    public static void main(String[] args){
        Chinses c1 = new Chinses();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";

        Chinses c2 = new Chinses();
        c2.name = "马龙";
        c2.age = 30;

        c2.nation = "CHINA";  //修改过
        System.out.println(c1.nation); //打印CHINA

        c1.eat();

        Chinses.show(); //随着类的加载而加载，可以通过"类.静态方法"的方式进行调用


    }

}

//中国人
class Chinses{

    String name;
    int age;

    static String nation;

    public void eat(){  //在非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
        System.out.println("中国人吃中餐");
        show();
    }

    public static void show(){  //在静态方法中，只能调用静态的方法或属性
        System.out.println("我是一个中国人");
        System.out.println(nation); //或者System.out.println(Chinses.nation);
    }
}
