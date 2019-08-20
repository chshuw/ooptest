package com.wang.call;

/**
 * 小明和小李相约一起去吃早饭，但是小李起的有点晚要先洗漱，等小李洗漱完成后，通知小明再一起去吃饭。
 * 小明就是类A，小李就是类B。不同的是我们新建一个吃饭的接口EatRice，接口中有个抽象方法eat()。
 * 在小明中调用这个接口，并实现eat()；小李声明这个接口对象，并且调用这个接口的抽象方法。
 */
public class CallBack {
    public static void main(String[] args){
        XiaoMing ming = new XiaoMing();
        ming.eatFood();

    }

}
