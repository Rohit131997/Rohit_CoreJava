package com.nisum.corejava.inheritance.examples;

// Base class
class Teachingusing_Hiearachical {
    public void javaProgramming() {
        System.out.println("Java Programming");
    }

    public void pythonProgramming() {
        System.out.println("Python Programming\n");
    }
}

// Extending from the base class Teachingusing_Hiearachical
class JavaProgrammer extends Teachingusing_Hiearachical {
    public void learn() {
        System.out.println("Java programmer Learn's:");
    }
}

// Extending from the base class Teachingusing_Hiearachical
class PythonProgrammer extends Teachingusing_Hiearachical {
    public void learn() {
        System.out.println("Python programmer Learn's:");
    }
}

class Test {
    public static void main(String[] args) {
        // Creaating an object for PythonProgrammer class
        PythonProgrammer pyobj = new PythonProgrammer();
        // calling method in PythonProgrammer class
        pyobj.learn();
        // calling a method in Base class
        pyobj.pythonProgramming();
        //Creaating an object for JavaProgrammer class
        JavaProgrammer jaobj = new JavaProgrammer();
        // calling method in PythonProgrammer class
        jaobj.learn();
        // calling a method in Base class
        jaobj.javaProgramming();
    }
}




