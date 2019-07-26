package day01.Behavior.Impl;

import day01.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I' cant't fly");
    }
}
