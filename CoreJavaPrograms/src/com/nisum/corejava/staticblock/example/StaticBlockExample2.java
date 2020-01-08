package com.nisum.corejava.staticblock.example;

public class StaticBlockExample2 {
    // filename: Main.java
        static int data1;
        static {
            System.out.println("static block called ");
        }
   public StaticBlockExample2(){
            System.out.println("Constructor called");
        }
    }

    class Main {
        public static void main(String args[]) {

            // Although we have two objects, static block is executed only once.
            StaticBlockExample2 obj1 = new StaticBlockExample2();
            StaticBlockExample2 obj2 = new StaticBlockExample2();

        }
    }


