package com.java.basics;

import com.java.oops.pillars.inheritance.single.Animal;

import java.io.Serializable;
import java.lang.reflect.Member;

public class Demo extends Animal implements Runnable, Serializable, Member {

    @Override
    public void run() {

    }

    @Override
    public Class<?> getDeclaringClass() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public boolean isSynthetic() {
        return false;
    }
}
