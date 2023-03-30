package CodeReader.UserData;
import CodeReader.Login.User;
import CodeReader.MainMethod;
import java.util.Scanner;
public class UserMethod {
    static Scanner sc = new Scanner(System.in);
    public static int ch;
    public static void userMethod() {
        System.out.println("                  **********************************                  ");
        System.out.println("                :::::::::::***User Login*** :::::::::::               ");
        System.out.println("                  **********************************                  ");
        System.out.println();
        System.out.println("Enter UserLogin id: ");
        String a = sc.next();
        System.out.println("Enter UserLogin Password: ");
        String b = sc.next();
        if (User.Id.equals(a) && User.PSW.equals(b)) {
            do {
                System.out.println(":::::::::::::::::::Login Succesfully:::::::::::::::::::");
                System.out.println();
                System.out.println(" 1.Add Student Data\n 2.Add Teacher Data\n 3.Add Supertiendent Data");
                System.out.println("Press 4 to Return To The Main menu ");
                ch = sc.nextInt();
                if (ch==4) {
                    MainMethod.data();
                } else {
                    switch (ch) {
                        case 1:
                            System.out.println();
                            Student.studentDataInput();
                            System.out.println();
                            System.out.println("Press 1 to Return To The User Login ");
                            System.out.println("Press 2 to Return To The Main menu ");
                            int ch1 = sc.nextInt();
                            if (ch1 == 1) {
                                System.out.println(" 1.Add Student Data\n 2.Add Teacher Data\n 3.Add Supertiendent Data");
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
                            Teacher.teacherDataInput();
                            System.out.println();
                            System.out.println("Press 1 to Return To The User Login ");
                            System.out.println("Press 2 to Return To The Main menu ");
                            int ch2 = sc.nextInt();
                            if (ch2 == 1) {
                                System.out.println(" 1.Add Student Data\n 2.Add Teacher Data\n 3.Add Supertiendent Data");
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
                            Supertendent.supertendentDataInput();
                            System.out.println();
                            System.out.println("Press 1 to Return To The User Login ");
                            System.out.println("Press 2 to Return To The Main menu ");
                            int ch3 = sc.nextInt();
                            if (ch3 == 1) {
                                System.out.println(" 1.Add Student Data\n 2.Add Teacher Data\n 3.Add Supertiendent Data");
                                System.out.print("Enter Ur Choice :");
                                int data = sc.nextInt();
                            } else if (ch3 == 2) {
                                MainMethod.data();
                            } else {
                                System.out.println("Pls Enter a Valid Input");
                                return;
                            }
                    }
                }
            } while (ch != 3);
        } else {
            System.out.println("Enter A Valid Id");
            return;
        }
    }
}

