package com.nisum.corejava.comparable.comparator.examples;
import java.util.*;
// Implementing Comparable
class Emp_Comparable_Example implements Comparable
{
    String name;
    int id;

    public Emp_Comparable_Example(String name , int id)
    {
        this.name = name;
        this.id = id;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee Data [" +
                "name='" + name + '\'' +
                ", id=" + id +
                ']';
    }

    // compareTo method to compare the id's
    public int compareTo(Object obj)
    {
        int id1 = this.id;
        Emp_Comparable_Example emp = (Emp_Comparable_Example)obj;
        int id2 = emp.id;
        if(id1<id2)
        {
            return -1;
        }
        else if(id1 > id2)
        {
            return +1;
        }
        else
        {
            return 0;
        }
    }
}

class Test
{
    public static void main(String[] args) {

        Emp_Comparable_Example emp1 = new Emp_Comparable_Example("Raja",101);
        Emp_Comparable_Example emp2 = new Emp_Comparable_Example("Guru",105);
        Emp_Comparable_Example emp3 = new Emp_Comparable_Example("Hari",106);
        Emp_Comparable_Example emp4 = new Emp_Comparable_Example("Ramu",102);

        // TreeSet of Emp_Comparable_Example type
        TreeSet<Emp_Comparable_Example> tobj = new TreeSet<>(  );
        tobj.add(emp1);
        tobj.add(emp2);
        tobj.add(emp3);
        tobj.add(emp4);

        Iterator<Emp_Comparable_Example> iterobj = tobj.iterator();
        {
            while (iterobj.hasNext())
            {
                System.out.println( iterobj.next() );
            }
        }
    }
}