package CodeReader.AdminData;

import java.util.Scanner;

public class collageInformation {
  public static   String Clg;
   public static String ClgAdd;
    public static   String lab;
    public static String Canteen;

   public static void collageInformationData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Collage Name :-");
        Clg=sc.next();

        System.out.print("Enter Collage Address :-");
        ClgAdd=sc.next();
    }

   public static void collageFacilityData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("About Library :");
        lab=sc.next();
        System.out.println("Provide Canteen Facility :");
        Canteen=sc.next();
    }

}
