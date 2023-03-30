package CodeReader.Login;

import java.util.Scanner;

public class Student {
  public static String Id;
    public static String PSW;
    public static void studentLoginData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter StudentLogin id:- ");
        Id = sc.next();
        System.out.print("Enter StudentLogin Password:- ");
        PSW=sc.next();
    }
}

