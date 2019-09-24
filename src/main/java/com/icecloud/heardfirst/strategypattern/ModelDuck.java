package com.icecloud.heardfirst.strategypattern;

/**
 * 书里举例了一只模型鸭 继承普通鸭子类
 * 为模型鸭实现一个飞行行为
 * 建一个测试类创建这个鸭子
 */
public class ModelDuck extends Duck{
    //实现鸭子展示
    public void display() {
        System.out.println("I'm a model duck");
    }
}
