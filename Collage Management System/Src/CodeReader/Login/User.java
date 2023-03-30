package CodeReader.Login;

import java.util.Scanner;

public class User {
 public static   String Id;
  public static String PSW;
   public static void userLoginData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User Id:- ");
        Id = sc.next();
        System.out.print("Enter User Password:- ");
        PSW=sc.next();
    }
}
