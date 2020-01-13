package com.nisum.corejava.multithreading.examples;

public class PriorityThread_example extends Thread {
    public void run() {
        System.out.println("Priority of running thread: " +
                Thread.currentThread().getPriority());
    }
}

class Test {
    public static void main(String[] args) {
        //creating thread.
        PriorityThread_example throbj1 = new PriorityThread_example();
        PriorityThread_example throbj2 = new PriorityThread_example();
        PriorityThread_example throbj3 = new PriorityThread_example();

        //set thread priority.
        throbj1.setPriority(Thread.MIN_PRIORITY);
        throbj2.setPriority(Thread.NORM_PRIORITY);
        throbj3.setPriority(Thread.MAX_PRIORITY);

        //start the thread.
        throbj1.start();
        throbj2.start();
        throbj3.start();
    }
}
