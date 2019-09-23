package com.wang.java1;


/**
 * 接口应用：代理模式
 */
public class NetWorkTest {
    public static void main(String[] args){
        Server server = new Server();  //new真实的服务器
        ProxyServer proxyServer = new ProxyServer(server);

        /**打印：
         *     联网之前的检查工作
         *     真实的服务器访问网络
         */
        proxyServer.browse();  //代理类browse里面包括browse写的方法
    }
}

interface NetWork{
    public void browse(); //浏览器
}


//被代理类（自己）
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork work;  //提供一个变量

    //构造器
    public ProxyServer(NetWork work){ //对属性初始化
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse(); //用work调用browse
    }
}
