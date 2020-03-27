/**
 *
 */
package com.corejava.userdefinedexception.examples;

import java.util.Scanner;

/**
 * @author nisum
 *
 */
class EntDoctorException extends Exception {
    EntDoctorException(String msg) {
        super(msg);
    }
}

class DentalDoctorException extends Exception {
    DentalDoctorException(String msg) {
        super(msg);
    }
}

class Appointment {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Available doctors.  \n 1. Dentist \n 2. ENT doctor \n Please enter the option to get the available timings of Doctors :");
        int userInput = sc.nextInt();
        if (userInput == 1) {
            System.out.println("Dental Doctor is avaliable from 18-21 to book an appointment");
            System.out.println("Enter the Time:");

            int time = sc.nextInt();
            if (time >= 18 && time <= 21) {
                System.out.println("Your appointment has been confirmed with Dental Doctor");
            } else {
                sc.close();
                throw new DentalDoctorException("Enter the valid time of Dental Doctor");

            }

        } else if (userInput == 2) {
            System.out.println("ENT Doctor is avaliable from 9-14 to book an appointment");
            System.out.println("Enter the Time:");

            int time = sc.nextInt();
            if (time >= 9 && time <= 14) {
                System.out.println("Your appointment has been conformed with ENT Doctor");
            } else {
                sc.close();
                throw new EntDoctorException("Enter the valid time of EntDoctor ");
            }

        } else {
            sc.close();
            System.out.println("Please enter the valid Option");

        }
    }
}
