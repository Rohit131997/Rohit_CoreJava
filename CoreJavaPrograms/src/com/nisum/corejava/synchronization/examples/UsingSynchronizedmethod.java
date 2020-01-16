package com.nisum.corejava.synchronization.examples;

public class UsingSynchronizedmethod {
    //synchronized method
    synchronized void printData(int obj) {
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(obj * loop);
            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }
}

class TestSynchronization {
    public static void main(String[] args) {
        //only one object
        final UsingSynchronizedmethod obj = new UsingSynchronizedmethod();

        Thread th1 = new Thread() {
            public void run() {
                obj.printData(5);

            }
        };
        Thread th2 = new Thread() {
            public void run() {
                obj.printData(100);
            }
        };

        th1.start();
        th2.start();
    }
}
