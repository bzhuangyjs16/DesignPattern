package Strategy.Behavior.Impl;

import Strategy.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I' cant't fly");
    }
}
