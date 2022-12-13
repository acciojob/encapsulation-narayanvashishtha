package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = 30;
        //'name' has private access in 'com.diver.RWOnly'
        obj.setName(69);
        obj.getName();
    }
}