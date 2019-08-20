package com.wang.call;

public class XiaoLi {
    public void washFace(String food,EatRice er){
        System.out.println("小李要洗刷");
        //B调用了A的方法
        er.eat(food);

    }
}
