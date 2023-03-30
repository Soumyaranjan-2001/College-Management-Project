package CodeReader.AdminData;

import CodeReader.Login.*;
import CodeReader.MainMethod;
import CodeReader.SupertiendentData.*;
import CodeReader.UserData.Student;
import CodeReader.UserData.Supertendent;
import CodeReader.UserData.UserMethod;

import java.util.Scanner;

import static CodeReader.UserData.UserMethod.*;

public class AdminMethod {


    static Scanner sc = new Scanner(System.in);
    public static int ch;

    public static int i;

    public static void adminMethod() {
        System.out.println("                  **********************************                  ");
        System.out.println("                :::::::::::***Admin Login*** :::::::::::              ");
        System.out.println("                  **********************************                  ");
        System.out.println(".............................................................................");
        System.out.println("Enter AdminLogin id: ");
        String a = sc.next();
        System.out.println("Enter AdminLogin Password: ");
        String b = sc.next();
        if (Admin.Id.equals(a) && Admin.PSW.equals(b)) {
            do {
                System.out.println(":::::::::::::::::::Login Succesfully:::::::::::::::::::");
                System.out.println();
                System.out.println(" 1.View StudentData\n 2.View Hostel Data\n 3.View Supertindent Data\n 4.Add Collage Information");
                System.out.println("Press 5 to Return To The Main menu ");
                    ch = sc.nextInt();
                if (ch==5) {
                    MainMethod.data();
                } else {
                    if (ch == 1 || ch == 2 || ch == 3 || ch == 4) {
                        switch (ch) {
                            case 1:
                                System.out.println();
                                AdminLogin.viewStudentData();
                                System.out.println();
                                System.out.println("Press 1 to Return To The Admin Login ");
                                System.out.println("Press 2 to Return To The Main menu ");
                                int ch1 = sc.nextInt();
                                if (ch1 == 1) {
                                    System.out.println(" 1.View StudentData\n 2.View Hostel Data\n 3.View Supertindent Data\n 4.Add Collage Information");
                                    System.out.print("Enter Ur Choice :");
                                    int data = sc.nextInt();
                                } else if (ch1 == 2) {
                                    MainMethod.data();
                                } else {
                                    System.out.println("Pls Enter a Valid Input");
                                    return;
                                }
                            case 2:
                                System.out.println();
                                SupertiendentData.viewHostelData();
                                System.out.println();
                                System.out.println("Press 1 to Return To The Admin Login ");
                                System.out.println("Press 2 to Return To The Main menu ");
                                int ch2 = sc.nextInt();
                                if (ch2 == 1) {
                                    System.out.println(" 1.View StudentData\n 2.View Hostel Data\n 3.View Supertindent Data\n 4.Add Collage Information");
                                    System.out.print("Enter Ur Choice :");
                                    int data = sc.nextInt();
                                } else if (ch2 == 2) {
                                    MainMethod.data();
                                } else {
                                    System.out.println("Pls Enter a Valid Input");
                                    return;
                                }
                            case 3:
                                System.out.println();
                                AdminLogin.viewSupertendentData();
                                System.out.println();
                                System.out.println("Press 1 to Return To The Admin Login ");
                                System.out.println("Press 2 to Return To The Main menu ");
                                int ch3 = sc.nextInt();
                                if (ch3 == 1) {
                                    System.out.println(" 1.View StudentData\n 2.View Hostel Data\n 3.View Supertindent Data\n 4.Add Collage Information");
                                    System.out.print("Enter Ur Choice :");
                                    int data = sc.nextInt();
                                } else if (ch3 == 2) {
                                    MainMethod.data();
                                } else {
                                    System.out.println("Pls Enter a Valid Input");
                                    return;
                                }
                            case 4:
                                AdminLogin.addClgData();
                                System.out.println();
                                AdminLogin.addClgFacility();
                                System.out.println();
                                System.out.println("Press 1 to Return To The Admin Login ");
                                System.out.println("Press 2 to Return To The Main menu ");
                                int ch7 = sc.nextInt();
                                if (ch7 == 1) {
                                    System.out.println(" 1.View StudentData\n 2.View Hostel Data\n 3.View Supertindent Data\n 4.Add Collage Information");
                                    System.out.print("Enter Ur Choice :");
                                    int data = sc.nextInt();
                                } else if (ch7 == 2) {
                                    MainMethod.data();
                                } else {
                                    System.out.println("Pls Enter a Valid Input");
                                    return;
                                }
                        }
                    } else {
                        System.out.println("Pls Enter Valid Input");
                    }
                }
            } while (ch != 4);
        } else {
            System.out.println("Enter Valid Id And Pwd");
            return;
        }
    }

}
