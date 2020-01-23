package com.nisum.corejava.customclass.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomHashMap {
    public static void main(String[] args) {

        // Creating a Hashmap Using Integer and class name as a field
        Map<Integer , Employee_Info> mapobj = new HashMap<>(  );

        Employee_Info emp1 = new Employee_Info( 1901, "Ramu" );
        Employee_Info emp2 = new Employee_Info( 1902, "Sita" );
        Employee_Info emp3 = new Employee_Info( 1903, "Raja" );
        Employee_Info emp4 = new Employee_Info( 1904, "Geeta" );

        // Adding to hashmap using put method
        mapobj.put( emp1.getEmpId(), emp1 );
        mapobj.put( emp2.getEmpId(), emp2 );
        mapobj.put( emp3.getEmpId(), emp3 );
        mapobj.put( emp4.getEmpId(), emp4 );

        Iterator<Integer> iterobj = mapobj.keySet().iterator();
        while (iterobj.hasNext())
        {
            // Creating a object for employee_Info class to get the values
            Employee_Info employee = mapobj.get( iterobj.next() );
            employee.display();
        }

    }
}
