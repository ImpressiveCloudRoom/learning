package com.icecloud.heardfirst.strategypattern;

public class FlyRocketPowered implements FlyBehavior {
    //具体实现
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
