package com.wang.day09.test1;

/*
 * 方法的形参的传递机制：值传递
 *
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 *
 * 2.值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 * 如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 *
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("***********基本数据类型：****************");
        System.out.println("m = " + m + ", n = " + n);
        //交换两个变量的值的操作
//		int temp = m ;
//		m = n;
//		n = temp;

        //*********************************************************************

        System.out.println("***********引用数据类型(数组、对象等)：****************");
        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m, n);

        System.out.println("m = " + m + ", n = " + n);  //此时的m和n的值是main方法中的m和n
    }


    public void swap(int m,int n){
        int temp = m ;
        m = n;
        n = temp;
        System.out.println("m = " + m + ", n = " + n);
    }
}
