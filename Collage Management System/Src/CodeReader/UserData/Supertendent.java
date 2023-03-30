package CodeReader.UserData;

import CodeReader.AdminData.AdminLogin;

import java.util.Scanner;

public class Supertendent {
  public static   int id;
    public static String name;
    public static String gender;
    public static String address;
    public static int age;

    static Scanner Sc = new Scanner(System.in);
    public CodeReader.AdminData.AdminLogin AdminLogin;
    public Supertendent UserData;

    public static void supertendentDataInput(){
        System.out.println();
        System.out.println("  ::::::::Input Supertendent Data::::::::    ");
        System.out.print("Enter Supertendent Id:- ");
        id = Sc.nextInt();
        System.out.print("Enter Supertendent Name:- ");
        name = Sc.next();
        System.out.print("Enter Supertendent Gender:- ");
        gender = Sc.next();
        System.out.print("Enter Supertendent Address:- ");
        address = Sc.next();
        System.out.print("Enter Supertendent Age:- ");
        age = Sc.nextInt();
    }
}
