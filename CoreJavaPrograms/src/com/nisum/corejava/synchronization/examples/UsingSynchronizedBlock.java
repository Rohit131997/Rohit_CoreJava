package com.nisum.corejava.synchronization.examples;

public class UsingSynchronizedBlock {
   public void printData(int num) {
        //synchronized block
        synchronized (this) {
            for (int loop = 1; loop <= 5; loop++) {
                System.out.println(num * loop);
                try {
                    Thread.sleep(800);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }//end of the method
}

class MyThread1 extends Thread {
    UsingSynchronizedBlock objt1;

    MyThread1(UsingSynchronizedBlock objt1) {
        this.objt1 = objt1;
    }

    public void run() {
        objt1.printData(7);
    }

}

class MyThread2 extends Thread {
    UsingSynchronizedBlock objt2;

    MyThread2(UsingSynchronizedBlock objt2) {
        this.objt2 = objt2;
    }

    public void run() {
        objt2.printData(230);
    }
}

class TestSynchronizedBlock {
    public static void main(String[] args) {
        UsingSynchronizedBlock obj = new UsingSynchronizedBlock();
        MyThread1 th1 = new MyThread1(obj);
        MyThread2 th2 = new MyThread2(obj);
        th1.start();
        th2.start();
    }
}
