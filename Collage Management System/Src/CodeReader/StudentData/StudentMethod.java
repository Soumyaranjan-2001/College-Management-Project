package CodeReader.StudentData;

import CodeReader.AdminData.collageInformation;
import CodeReader.Login.Admin;
import CodeReader.Login.Student;
import CodeReader.MainMethod;
import CodeReader.SupertiendentData.SupertiendentData;

import java.util.Scanner;

public class StudentMethod {
    static Scanner sc = new Scanner(System.in);
    public static int ch;
    public static void studentMethod() {

        System.out.println("                  **********************************                  ");
        System.out.println("               :::::::::::***Student Login*** :::::::::::             ");
        System.out.println("                  **********************************                  ");
        System.out.println();
        System.out.println("Enter StudentLogin id: ");
        String a = sc.next();
        System.out.println("Enter StudentLogin Password: ");
        String b = sc.next();
        System.out.println();

        if (Student.Id.equals(a) && Student.PSW.equals(b)) {

            do {
                System.out.println(":::::::::::::::::::Login Succesfully:::::::::::::::::::");
                System.out.println();
                System.out.println(" 1.View Student Data\n 2.View College Data\n 3.view teacher details\n 4.View Hostel Data");
                System.out.println("Press 5 to Return To The Main menu ");
                ch = sc.nextInt();
                if (ch==5) {
                    MainMethod.data();
                } else {
                switch (ch) {
                    case 1:
                        System.out.println();
                        StudentData.viewStudentData();
                        System.out.println();
                        System.out.println("Press 1 to Return To The Student Login ");
                        System.out.println("Press 2 to Return To The Main menu ");
                        int ch1 = sc.nextInt();
                        if (ch1 == 1) {
                            System.out.println(" 1.View Student Data\n 2.View College Data\n 3.view teacher details\n 4.View Hostel Data");
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
                               StudentData.viewCollageInformation();
                                System.out.println();
                                System.out.println("Press 1 to Return To The Student Login ");
                                System.out.println("Press 2 to Return To The Main menu ");
                                int ch2 = sc.nextInt();
                                if (ch2 == 1) {
                                    System.out.println(" 1.View Student Data\n 2.View College Data\n 3.view teacher details\n 4.View Hostel Data");
                                    System.out.print("Enter Ur Choice :");
                                    int data = sc.nextInt();
                                } else if (ch2 == 2) {
                                    MainMethod.data();
                                } else {
                                    System.out.println("Pls Enter a Valid Input");
                                    return;


                        }
                        break;
                    case 3:
                        System.out.println();
                        StudentData.viewTeacherData();
                        System.out.println();
                        System.out.println();
                        System.out.println("Press 1 to Return To The Student Login ");
                        System.out.println("Press 2 to Return To The Main menu ");
                        int ch4 = sc.nextInt();
                        if (ch4 == 1) {
                            System.out.println(" 1.View Student Data\n 2.View College Data\n 3.view teacher details\n 4.View Hostel Data");
                            System.out.print("Enter Ur Choice :");
                            int data = sc.nextInt();
                        } else if (ch4 == 2) {
                            MainMethod.data();
                        } else {
                            System.out.println("Pls Enter a Valid Input");
                            return;
                        }
                    case 4:
                        System.out.println();
                        SupertiendentData.viewHostelData();
                        System.out.println();
                        System.out.println("Press 1 to Return To The Student Login ");
                        System.out.println("Press 2 to Return To The Main menu ");
                        int ch6 = sc.nextInt();
                        if (ch6 == 1) {
                            System.out.println(" 1.View Student Data\n 2.View College Data\n 3.view teacher details\n 4.View Hostel Data");
                            System.out.print("Enter Ur Choice :");
                            int data = sc.nextInt();
                        } else if (ch6 == 2) {
                            MainMethod.data();
                        } else {
                            System.out.println("Pls Enter a Valid Input");
                            return;
                        }
                }
                }
            } while (ch != 4);
        } else {
            System.out.println("Pls Enter a valid id");
            return;
        }
    }
}
