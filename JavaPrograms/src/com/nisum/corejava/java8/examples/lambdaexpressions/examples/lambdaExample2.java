package com.nisum.corejava.java8.examples.lambdaexpressions.examples;

import com.nisum.corejava.util.MyLogger;

@FunctionalInterface
interface Movietickets {
    // Only one abstract method
    void bookTickets();
}

public class lambdaExample2 {

    public static void main(String[] args) {


/*this is how we implement before java 8

class Bookmyshow implements Movietickets{
public void bookTickets(){
    System.out.println( "Booked movie tickets" );
  }
}*/

/*Anonymous class derived as:

Movietickets tick = new Movietickets() {
    @Override
    public void bookTickets() {
        System.out.println( "Booked movie tickets" );
    }
};
tick.bookTickets();*/

// By using lambda expressions
        Movietickets ticket = () -> MyLogger.consoleLogger.info( "Booked Movie tickets" );
        ticket.bookTickets();

    }

}



