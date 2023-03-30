package CodeReader.StudentData;

import CodeReader.AdminData.AdminLogin;
import CodeReader.SupertiendentData.SupertiendentData;
import CodeReader.UserData.Student;
import CodeReader.AdminData.collageInformation;
import CodeReader.UserData.Teacher;

import java.util.Scanner;



public class StudentData {
    static Scanner sc = new Scanner(System.in);
    int roll_no;
    int hostel_no;

    public static void viewStudentData() {
        System.out.print("Enter roll no :");
        int roll_no = sc.nextInt();
        if (roll_no == Student.rollno) {
            System.out.println("::::::::::::::::Student data:::::::::::::::::");
            AdminLogin.viewStudentData();
        } else {
            System.out.println("Sry Data Not found");
        }
    }

    public static void viewCollageInformation() {
        System.out.println();
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":Collage Name Is:- " + collageInformation.Clg+"     :");
        System.out.println(":Collage Adress Is:- " + collageInformation.ClgAdd+":");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

    public static void viewCollageFacility() {
        System.out.println("Library:-  " + collageInformation.lab);
        System.out.println("Canteen:- " + collageInformation.Canteen);
    }

   public static void viewTeacherData() {
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":Teacher name:- " + Teacher.name+"         :");
        System.out.println(":Teacher Id:- " + Teacher.id+"             :");
        System.out.println(":Teacher Address:- " + Teacher.address+"   :");
        System.out.println(":Teacher Gender:- " + Teacher.gender+"     :");
        System.out.println(":Teacher Age:- " + Teacher.age+"           :");
        System.out.println(":Teacher Brach:-" + Teacher.branch+"       :");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
    }

  public static  void viewHostelData() {
        System.out.print("Enter hostel no :");
        int hostel_no = sc.nextInt();
        if (hostel_no == SupertiendentData.hostelId) {
            System.out.println("Hostel Name:-" + SupertiendentData.hostelName);
            System.out.println("Hostel id:- " + SupertiendentData.hostelId);
        } else {
            System.out.println("not found !!!!");
        }
    }
}
