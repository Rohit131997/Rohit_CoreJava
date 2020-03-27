package com.corejava.puzzles.examples;

import java.util.Scanner;

public class Delete_an_element_in_Array {
    public static void main(String args[])
    {
        // initialize the objects.
        int size, value1, del, count=0;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        // enter array size.
        System.out.print("Enter Array Size : ");
        size = scan.nextInt();

        // enter elements.
        System.out.println("Enter Array Elements : ");
        for(value1=0; value1<size; value1++)
        {
            arr[value1] = scan.nextInt();
        }

        // enter elements which is to be deleted.
        System.out.print("Enter Element to be Delete : ");
        del = scan.nextInt();
        for(value1=0; value1<size; value1++)
        {
            if(arr[value1] == del)
            {
                for(int j=value1; j<(size-1); j++)
                {
                    arr[j] = arr[j+1];
                }
                count++;
                break;
            }
        }
        if(count==0)
        {
            // print if entered element not found.
            System.out.print("Element Not Found..!!");
        }
        else
        {
            // element deleted.
            System.out.print("Element Deleted Successfully..!!");

            // new array after deletion.
            System.out.print("\nNow the New Array is :\n");
            for(value1=0; value1<(size-1); value1++)
            {
                System.out.print(arr[value1]+ " ");
            }
        }
    }
}
