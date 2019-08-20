package com.wang.call;

/**
 *
 */
public class XiaoMing implements EatRice {

    public void eatFood(){
        XiaoLi li = new XiaoLi();
        li.washFace("大龙虾",this); //this指的是小明这个类实现的EatRice接口

    }
    @Override
    public void eat(String food) {
        System.out.println("小明和小李一起去吃" + food);
    }
}
