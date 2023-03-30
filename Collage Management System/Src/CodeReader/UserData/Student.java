package CodeReader.UserData;

import CodeReader.AdminData.AdminLogin;

import java.util.Scanner;

public class Student {
    public static int rollno;
    public static String name;
    public  static String gender;
    public  static String address;
    public static int age;
    public static String branch;

   static Scanner Sc  = new Scanner(System.in);
    public CodeReader.AdminData.AdminLogin AdminLogin;


    public static void studentDataInput(){
        System.out.println();
        System.out.println("  ::::::::Input Student Data::::::::    ");
        System.out.print("Enter Student Rollno:- ");
        rollno = Sc.nextInt();
        System.out.print("Enter Student Name:- ");
        name = Sc.next();
        System.out.print("Enter Student Gender:- ");
        gender = Sc.next();
        System.out.print("Enter Student Address:- ");
        address = Sc.next();
        System.out.print("Enter Student Age:- ");
        age = Sc.nextInt();
        System.out.print("Enter Student Branch:- ");
        branch = Sc.next();
    }
}

