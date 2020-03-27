package com.corejava.synchronization.examples;

class UsingStaticSynchronized {
    // Static Synchronized block
    synchronized static void printData(int num){
        for(int loop = 1;loop <= 5; loop++){
            System.out.println(num * loop);
            try{
                Thread.sleep(800);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
}

class MyThread11 extends Thread{
    public void run(){
        UsingStaticSynchronized.printData(10);
    }
}

class MyThread12 extends Thread{
    public void run(){
        UsingStaticSynchronized.printData(45);
    }
}
class TestSynchronizationblock{
    public static void main(String[] args){
        MyThread11 thr1 = new MyThread11();
        MyThread12 thr2 = new MyThread12();
        thr1.start();
        thr2.start();
    }
}
