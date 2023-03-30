package CodeReader.SupertiendentData;

import CodeReader.Login.Supertiendent;
import CodeReader.MainMethod;

import java.util.Scanner;

public class SuperitendentMethod {


    static Scanner sc = new Scanner(System.in);
    static int ch;

    public static void supertiendentMain() {
        System.out.println("                  **********************************                  ");
        System.out.println("             :::::::::::***Supertiendent Login***:::::::::::          ");
        System.out.println("                  **********************************                  ");
        System.out.println();
        System.out.print("Enter SupertiendentLogin id: ");
        String a = sc.next();
        System.out.print("Enter SupertiendentLogin Password: ");
        String b = sc.next();

        if (Supertiendent.Id.equals(a) && Supertiendent.PSW.equals(b)) {
            do {
                System.out.println(":::::::::::::::::::Login Succesfully:::::::::::::::::::");
                System.out.println();
                System.out.println(" 1.Add Hostel Data\n 2.Add Hostel Facility");
                System.out.println("Press 3 to Return To The Main menu ");
                ch = sc.nextInt();
                if (ch==3) {
                    MainMethod.data();
                } else {
                switch (ch) {
                    case 1:
                        System.out.println();
                        SupertiendentData.addHostelData();
                        System.out.println();
                        System.out.println("Press 1 to Return To The Supertiendent Login ");
                        System.out.println("Press 2 to Return To The Main menu ");
                        int ch1 = sc.nextInt();
                        if (ch1 == 1) {
                            System.out.println("1. Add Hostel Data\n 2.Add Hostel Facility");
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
                        SupertiendentData.addHostelFacility();
                        System.out.println();
                        System.out.println("Press 1 to Return To The Supertiendent Login ");
                        System.out.println("Press 2 to Return To The Main menu ");
                        int ch2 = sc.nextInt();
                        if (ch2 == 1) {
                            System.out.println("1. Add Hostel Data\n 2.Add Hostel Facility");
                            System.out.print("Enter Ur Choice :");
                            int data = sc.nextInt();
                        } else if (ch2 == 2) {
                            MainMethod.data();
                        } else {
                            System.out.println("Pls Enter a Valid Input");
                            return;
                        }
                }
            }
            } while (ch != 2);
        } else {
            System.out.println("Enter a valid id....");
            return;
        }
    }
}

