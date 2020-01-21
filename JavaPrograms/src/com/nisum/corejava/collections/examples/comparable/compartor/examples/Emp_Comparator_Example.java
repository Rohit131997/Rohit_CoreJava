package com.nisum.corejava.collections.examples.comparable.compartor.examples;

import java.util.*;

public class Emp_Comparator_Example implements Comparator {
    String name;
    int id;



    public Emp_Comparator_Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Emp_Comparator_Example() {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee Data [" +
                "name='" + name + '\'' +
                ", id=" + id +
                ']';
    }

    public int compare(Object obj1, Object obj2)
    {
        Emp_Comparator_Example emp1 = (Emp_Comparator_Example)obj1;
        Emp_Comparator_Example emp2 = (Emp_Comparator_Example)obj2;
        String str1 = emp1.name;
        String str2 = emp2.name;
        return str1.compareTo( str2 );
    }
}
class Demo
{
    public static void main(String[] args) {

        Emp_Comparator_Example emp1 = new Emp_Comparator_Example("Raja",101);
        Emp_Comparator_Example emp2 = new Emp_Comparator_Example("Guru",105);
        Emp_Comparator_Example emp3 = new Emp_Comparator_Example("Hari",106);
        Emp_Comparator_Example emp4 = new Emp_Comparator_Example("Ramu",102);

        //TreeSet<Emp_Comparator_Example> tobj = new TreeSet<Emp_Comparator_Example>(  );
        TreeSet<Emp_Comparator_Example> tobj = new TreeSet<Emp_Comparator_Example>( new Emp_Comparator_Example() );
        tobj.add(emp1);
        tobj.add(emp2);
        tobj.add(emp3);
        tobj.add(emp4);

        Iterator<Emp_Comparator_Example> iterobj = tobj.iterator();
        {
            while (iterobj.hasNext())
            {
                System.out.println( iterobj.next() );
            }
        }
    }
}
