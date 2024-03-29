package com.wang.day09.test1;

public class ValueTransferTest2 {
    public static void main(String[] args){

        Data data = new Data();  //创建对象

        data.m = 10;  //给data.m赋值10
        data.n = 20;

        System.out.println("m = "+ data.m + ", n = " + data.n);

        //交换m和n的值

        ValueTransferTest2 text = new ValueTransferTest2();
        text.swap(data);  //data是实参
        System.out.println("m = "+ data.m + ", n = " + data.n);
    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{
    int m;
    int n;

}
