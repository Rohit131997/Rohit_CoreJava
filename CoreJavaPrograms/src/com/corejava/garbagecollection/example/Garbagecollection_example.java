package com.corejava.garbagecollection.example;

public class Garbagecollection_example {
    public void finalize() {
        System.out.println("Object is Garbage collected ");
    }

    public static void main(String[] args) {
        Garbagecollection_example obj1 = new Garbagecollection_example();
        Garbagecollection_example obj2 = new Garbagecollection_example();
        obj1 = null;
        obj2 = null;
        System.gc();
    }
}
