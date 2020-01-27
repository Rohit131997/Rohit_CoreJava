package com.nisum.corejava.serilization.deserilization.example;

import java.io.*;


public class DetailsDemo {
    public static void main(String [] args) {
        SerializationExample obj = new SerializationExample ();
        obj.name = "Rohit";
        obj.address = "KPHB, Hyderabad";
        obj.phoneNumber = 987654;
        obj.id = 101;

        try {
            // Saving as a text file
            FileOutputStream fiout = new FileOutputStream("C:\\Users\\nisum\\Desktop\\New folder\\Serialize.txt");
            ObjectOutputStream out = new ObjectOutputStream(fiout);
            out.writeObject(obj);
            out.close();

            fiout.close();
            // It will print the data in unformetted pattern
            System.out.println("Serialized data is saved in C:\\Users\\nisum\\Desktop\\New folder\\Serialize.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
