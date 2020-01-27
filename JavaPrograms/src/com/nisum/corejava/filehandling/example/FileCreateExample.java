package com.nisum.corejava.filehandling.example;

import java.io.File;
import java.io.IOException;
public class FileCreateExample {
    public static void main(String[] args) {
        //initialize File constructor
        File obj = new File( "C:\\Users\\nisum\\Desktop\\New folder\\File.txt" );
        try {
            boolean createFile = obj.createNewFile();
            if (createFile) {
                System.out.println( "New File is created." );
            } else {
                System.out.println( "File already exists." );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}