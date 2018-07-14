package io.bernardme.dp.proxy.inhance;

/**
 * @Author: BernardMe
 * @Date: 7/14/2018 17:57
 */
//相当于这个礼仪公司(代理类)
public class StaticProxy {
    //持有了迎宾小姐的资源
    private HelloGirl2 helloGirl;

    public StaticProxy(){
        helloGirl = new HelloGirl2();
    }
    //迎宾活动
    public void doActivi(){
        //自己的乐队奏乐
        System.out.printf("%s do sth...\n", "乐队");
        //迎宾小姐欢迎
        helloGirl.sayHello();
    }

    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.doActivi();
    }
}
