package com.nisum.corejava.serilization.deserilization.example;

import java.io.*;


public class DeserializeExample {
    public static void main(String[] args) {
        SerializationExample obj = null;
        try {
            FileInputStream fileIn = new FileInputStream( "C:\\Users\\nisum\\Desktop\\New folder\\Serialize.txt" );
            ObjectInputStream in = new ObjectInputStream( fileIn );
            obj = (SerializationExample) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        } catch (ClassNotFoundException classex) {
            System.out.println( "Employee class not found" );
            classex.printStackTrace();
            return;
        }

        // It will get the data present in Serialized data to Deserialize data and get it in a Format
        System.out.println( "Deserialized Employee Details..." );
        System.out.println( "Name: " + obj.name );
        System.out.println( "Address: " + obj.address );
        System.out.println( "PhoneNumber: " + obj.phoneNumber );
        System.out.println( "Id: " + obj.id );
    }
}
