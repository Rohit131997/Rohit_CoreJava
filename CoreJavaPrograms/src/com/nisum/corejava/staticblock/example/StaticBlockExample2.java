package com.nisum.corejava.staticblock.example;

public class StaticBlockExample2 {
    // filename: Main.java
        static int i;
        int j;
        static {
            i = 10;
            System.out.println("static block called ");
        }
    StaticBlockExample2(){
            System.out.println("Constructor called");
        }
    }

    class Main {
        public static void main(String args[]) {

            // Although we have two objects, static block is executed only once.
            StaticBlockExample2 t1 = new StaticBlockExample2();
            StaticBlockExample2 t2 = new StaticBlockExample2();
        }
    }


