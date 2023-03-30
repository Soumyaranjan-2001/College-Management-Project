package CodeReader.SupertiendentData;

import java.util.Scanner;

public class SupertiendentData {
    public static int hostelId;
    public static String hostelName;
    public static String facility1;
    public static String facility2;
    public static String facility3;
    public static String facility4;
    public static String facility5;

    static Scanner sc = new Scanner(System.in);
    public CodeReader.SupertiendentData.SupertiendentData SupertiendentData;

    public static void addHostelData() {

        System.out.print("Enter hostel id :");
        hostelId = sc.nextInt();
        System.out.print("Enter hostel name :");
        hostelName = sc.next();

    }

    public static void addHostelFacility() {
        System.out.println("Enter facility :");
        facility1 = sc.next();
        System.out.println("Enter facility :");
        facility2 = sc.next();
        System.out.println("Enter facility :");
        facility3 = sc.next();
        System.out.println("Enter facility :");
        facility4 = sc.next();
        System.out.println("Enter facility :");
        facility5 = sc.next();
    }

    public static void viewHostelFacilty() {
        System.out.println("::::::::::::::::::::::::::::");
        System.out.println("Facilty 1: " + facility1);
        System.out.println("Facilty 2: " + facility2);
        System.out.println("Facilty 3: " + facility3);
        System.out.println("Facilty 4: " + facility4);
        System.out.println("Facilty 5: " + facility5);
        System.out.println(":::::::::::::::::::::::::::::");
    }

    public static void viewHostelData() {
        System.out.println(":::::::::::::::::::::::::::::::");
        System.out.println("Hostel Id:- " + hostelId);
        System.out.println("Hostel Name:- " + hostelName);
        System.out.println(":::::::::::::::::::::::::::::::");

    }
}
