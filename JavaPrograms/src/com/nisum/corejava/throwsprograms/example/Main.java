package com.nisum.corejava.throwsprograms.example;
import java.io.*;
public class Main {
    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile=new File("test.txt");
        FileInputStream stream=new FileInputStream(newFile);
    }
    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException ioe){
            System.out.println(ioe);
        }
        System.out.println("Rest of the code..");
    }
}
