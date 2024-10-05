package com.java.oops.association.composition;

class Engine{
    String engineType;
    Engine(String engineType){
        this.engineType = engineType;
    }
    void displayType(){
        System.out.println("Engine Type: " + engineType);
    }
}
class Car {
    String name;
    Engine engine;
    Car(String name, String engineType){
        this.name = name;
        this.engine = new Engine(engineType); // Object created
    }
    void car_details(){
        System.out.println("Car Name: " + name);
        engine.displayType();
    }
}
public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Electric");
        car.car_details();
    }
}
