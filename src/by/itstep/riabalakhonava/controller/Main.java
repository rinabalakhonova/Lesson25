package by.itstep.riabalakhonava.controller;

import by.itstep.riabalakhonava.model.entity.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human(name: "Alex", age: 20);

        System.out.println(human1.getInfo()));
System.out.println(human2.getInfo());
    }
}
