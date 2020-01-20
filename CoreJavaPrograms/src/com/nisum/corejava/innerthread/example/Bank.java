package com.nisum.corejava.innerthread.example;

public class Bank {
    int amount = 1000;

    // Synchronized method for withdrawing amount
    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing the amount ");
        if (this.amount < amount) {
            System.out.println("Less balance, please deposit the money");
            try {
                // The thread withdraw is in waiting state
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        this.amount = this.amount - amount;
        System.out.println("Withdraw is completed");
    }

    // Synchronized method for deposit amount
    synchronized void deposit(int amount) {
        System.out.println("Going to deposit the money");
        this.amount = this.amount + amount;
        System.out.println("Money deposited");
        // release the thread which is in waiting state
        notify();
    }

}

class Test {
    public static void main(String[] args) {
        Bank obj = new Bank();
        // Creating a new thread to call the methods
        new Thread() {
            public void run() {
                obj.withdraw(1500);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.deposit(1000);
            }
        }.start();
    }
}

