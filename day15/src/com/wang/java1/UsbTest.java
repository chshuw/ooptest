package com.wang.java1;

/**
 * 接口的使用
 * 1.接口使用上也满足多态性；
 * 2.接口，实际上就是定义了一种规范；
 * 3.开发中，体会面向接口编程；
 */
public class UsbTest {
    public static void main(String[] args){
        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();  //接口不能造对象，但是实现接口的类可以造对象
        com.transferData(flash);

        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3.创建了接口的匿名实现类的非匿名对象  (对象是phone)
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开启工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        com.transferData(phone);

        //4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开启工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3停止工作");
            }
        });
    }
}

interface USB{
    void start();
    void stop();
}

class Computer{
    //传输数据
    public void transferData(USB usb){ //USB usb = new Flash() 多态
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("u盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("u盘结束工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
