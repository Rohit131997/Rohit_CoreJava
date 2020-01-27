package com.nisum.corejava.filehandling.example;

import java.io.FileWriter;
import java.io.IOException;
public class WriteInFile {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter obj = new FileWriter( "C:\\Users\\nisum\\Desktop\\New folder\\Data.txt" );
            obj.write( "Welcome World" );
            obj.close();
        } catch (Exception ex) {
            System.out.println( ex );
        }
        System.out.println( "File Created Sucessfully" );
    }
}

