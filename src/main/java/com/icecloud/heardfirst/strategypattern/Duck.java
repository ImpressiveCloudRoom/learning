package com.icecloud.heardfirst.strategypattern;

/**
 * 一只不知道是什么的鸭子，它会用不同姿势 叫  飞  。
 * 先为它创建 叫 和 飞 的行为抽象接口
 * 有抽象方法必须是抽象类
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    //给鸭子加上展示自己的抽象方法
    public abstract void display();

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    //设置行为
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
