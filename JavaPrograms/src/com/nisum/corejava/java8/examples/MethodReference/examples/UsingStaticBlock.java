package com.nisum.corejava.java8.examples.MethodReference.examples;

import com.nisum.corejava.util.MyLogger;

interface Performing {
    void perform();
}

public class UsingStaticBlock {
    public static void data() {
        MyLogger.consoleLogger.info( "Hello people" );

    }

    public static void main(String[] args) {

        // refering static method
        Performing obj = UsingStaticBlock::data;

        // calling interface method
        obj.perform();
    }

}
