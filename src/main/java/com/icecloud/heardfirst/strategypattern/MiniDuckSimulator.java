package com.icecloud.heardfirst.strategypattern;

public class MiniDuckSimulator {
    //还需要将模型鸭子的行为设置一下
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.setQuackBehavior(new ModelDuckQuack());
        //不设置行为会报错
        model.fly();
        model.quack();
        //需要设置其他鸭子 按照上面方法进行拓展组装
        //......
        //书本上的策略模式结束
    }
}
