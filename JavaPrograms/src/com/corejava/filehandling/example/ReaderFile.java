package com.corejava.filehandling.example;

import java.io.FileReader;

public class ReaderFile {
    public static void main(String args[]) throws Exception {
        FileReader obj = new FileReader( "C:\\Users\\nisum\\Desktop\\New folder\\Data.txt" );
        int value;
        while ((value = obj.read()) != -1)
            System.out.print( (char) value );
        obj.close();
    }
}

