package CodeReader;

import CodeReader.AdminData.AdminMethod;
import CodeReader.Login.Admin;
import CodeReader.Login.Student;
import CodeReader.Login.Supertiendent;
import CodeReader.Login.User;
import CodeReader.StudentData.StudentMethod;
import CodeReader.SupertiendentData.SuperitendentMethod;
import CodeReader.UserData.UserMethod;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
        System.out.println(":                 * ********************************************************* *                : ");
        System.out.println(":                 *              :::::::::::::::::::::::::::::::              *                : ");
        System.out.println(":                 *                COLLLAGE MANAGEMENT PROJECT                *                : ");
        System.out.println(":                 *              :::::::::::::::::::::::::::::::              *                : ");
        System.out.println(":                 * ********************************************************* *                : ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
        System.out.println();
        System.out.println(" ::__________________Pls Input Login Id And Password__________________::");
        System.out.println();
        Admin.adminLoginData();
        System.out.println();
        User.userLoginData();
        System.out.println();
        Student.studentLoginData();
        System.out.println();
        Supertiendent.supertendentLoginData();
        System.out.println();
        data();
    }

    public static void data() {
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************************************************************************");
        System.out.println("                 :::::::::::::::::::::::::::::::::::::::                              ");
        System.out.println("                          WELCOME TO OUR PROJECT                                      ");
        System.out.println("                 :::::::::::::::::::::::::::::::::::::::                              ");
        System.out.println("**************************************************************************************");
        System.out.println();
        do {
            System.out.println("###############################");
            System.out.println("#:::::::Main Menu:::::::#");
            System.out.println(" 1.Admin Login\n 2.User Login\n 3.StudentLogin\n 4.Supertiendet Login\n 5.Exit");
            System.out.println("###############################");
            System.out.println("............ENTER UR CHOICE IN MAIN MENU............");
            data = sc.nextInt();
            switch (data) {
                case 1:
                    System.out.println();
                    AdminMethod.adminMethod();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    UserMethod.userMethod();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    StudentMethod.studentMethod();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    SuperitendentMethod.supertiendentMain();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("*********************************************************************************");
                    System.out.println("        :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"  );
                    System.out.println("                        THANK YOU VISIT AGAIN                      ");
                    System.out.println("        :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"  );
                    System.out.println("*********************************************************************************");
            }
        } while (data != 5);
    }
}