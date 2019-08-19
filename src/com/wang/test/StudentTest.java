package com.wang.test;

public class StudentTest {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s1 = new Student();
//        Student s1 = new Student();
//        Student s1 = new Student();
//        Student s1 = new Student();

        //声明Student类型的数组
        Student[] stus = new Student[20];

        for (int i = 0; i < stus.length; i++) {
            //通过循环方式给数组元素赋值( 创建对象)
            stus[i] = new Student();   //new 20个对象后赋值

            //给student对象的属性赋值
            stus[i].number = (i + 1);
            //年级：[1,6] 1~6
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1); //随机数
            //成绩：[0,100]
            stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 0); //随机数
        }

        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
//            System.out.println(stus[i].number + "," + stus[i].state + "," + stus[i].score);
            System.out.println(stus[i].info());
        }

        System.out.println("***********************************");

        //打印出3年级(state值为3)的学生信息
        for (int i = 0; i < stus.length; i++){
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }

        System.out.println("***********************************");
        
    }
}

class Student {
    int number;//学号
    int state; //年级
    int score; //成绩

    public String info(){
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }
}
