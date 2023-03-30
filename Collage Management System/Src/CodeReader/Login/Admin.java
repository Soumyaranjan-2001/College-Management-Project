package CodeReader.Login;

import java.util.Scanner;

public class Admin {
  public static   String Id;
   public static String PSW;
   public static void adminLoginData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter AdminLogin id:- ");
        Id = sc.next();
        System.out.print("Enter AdminLogin Password:- ");
        PSW = sc.next();
    }
}
