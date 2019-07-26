package day01;

import day01.Behavior.Impl.FlyWithWings;
import day01.Behavior.Impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
