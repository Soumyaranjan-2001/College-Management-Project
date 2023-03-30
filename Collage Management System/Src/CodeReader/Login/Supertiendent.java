package CodeReader.Login;

import java.util.Scanner;

public class Supertiendent {
 public static   String Id;
   public static String PSW;
    public static void supertendentLoginData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SupertendentLogin Id:- ");
        Id = sc.next();
        System.out.print("Enter SupertendentLogin Password:- ");
        PSW=sc.next();

    }
}
