package com.java.oops.pillars.abstraction.interfaces;

import java.io.Serializable;

public interface Animal  {
    void eat();
    void speed();
}
class Cheetah implements Animal {
    @Override
    public void eat() {
        System.out.println("Cheetah is a carnivore animal..!!");
    }
    @Override
    public void speed() {
        System.out.println("Cheetah is the fastest animal..!!");
    }
}
class Sloth implements Animal {
    @Override
    public void eat() {
        System.out.println("Sloth is an herbivore animal..!!");
    }
    @Override
    public void speed() {
        System.out.println("Sloth is the slowest animal..!!");
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        Sloth sloth = new Sloth();
        cheetah.eat();
        cheetah.speed();
        sloth.eat();
        sloth.speed();
    }

}
