package com.corejava.try_catch_finally.examples;

public class MultiCatch_example {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            arr[7] = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("The exception is ArithmeticException");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The exception is ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Parent exception");
        }
        System.out.println("The program is excecuted");
    }
}
