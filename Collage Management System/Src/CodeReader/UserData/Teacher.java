package CodeReader.UserData;

import java.util.Scanner;

public class Teacher {
   public static int id;
  public   static String name;
    public static String address;
   public static String gender;
    public static int age;
    public static String branch;

    static Scanner Sc = new Scanner(System.in);
    public Teacher UserData;

    static void teacherDataInput() {
        System.out.println();
        System.out.println("  ::::::::Input Teacher Data::::::::    ");
        System.out.print("Enter Teacher Id:- ");
        id = Sc.nextInt();
        System.out.print("Enter Teacher Name:- ");
        name = Sc.next();
        System.out.print("Enter Teacher Address:- ");
        address = Sc.next();
        System.out.print("Enter Teacher Gender:- ");
        gender = Sc.next();
        System.out.print("Enter Teacher Age:- ");
        age = Sc.nextInt();
        System.out.print("Enter Teacher Branch:-");
        branch = Sc.next();
    }
}

