package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        int curAge, retAge;
        Date d = new Date();
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("What is your current Age?");
        curAge = sc.nextInt();
        System.out.println("At what age would you like to retire?");
        retAge = sc.nextInt();

        //output
        System.out.println("You have " + (retAge - curAge) + " years left until you can retire.");
        System.out.println("It's " + (d.getYear() + 1900) + ", so you can retire in " + ((d.getYear() + 1900) + (retAge - curAge)) + ".");

        //close scanner
        sc.close();
    }
}
