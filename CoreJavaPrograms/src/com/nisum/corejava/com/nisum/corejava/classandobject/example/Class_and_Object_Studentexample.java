package com.nisum.corejava.com.nisum.corejava.classandobject.example;
// Creating a class
class Test {
    // defining fields for Student
    int id;
    String name;
}
    public class Class_and_Object_Studentexample{
        public static void main(String[] args) {
            Test obj = new Test();
            obj.id= 10;
            obj.name = "Ram";
            System.out.println(obj.id +" " + obj.name);
        }
    }

