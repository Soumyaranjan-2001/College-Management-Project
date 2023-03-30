package CodeReader.AdminData;


import CodeReader.UserData.Student;
import CodeReader.UserData.Supertendent;

public class AdminLogin {
    public static void viewStudentData(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":   Student Name:- "+Student.name+"     :");
        System.out.println(":   Student Rollno:- "+Student.rollno+" :");
        System.out.println(":   Student Gender:- "+Student.gender+" :");
        System.out.println(":   Student Age:- "+Student.age+"       :");
        System.out.println(":   Student Branch:- "+Student.branch+" :");
        System.out.println(":   Student Adress:- "+Student.address+":");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
   public static void viewSupertendentData(){
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println(":    Supertendent Name:- "+ Supertendent.name+":");
        System.out.println(":    Supertendent Id:-   "+ Supertendent.id+":");
        System.out.println(":    Supertendent Age:-   "+ Supertendent.age+":");
        System.out.println(":    Supertendent Gender:- "+Supertendent.gender+":");
        System.out.println(":    Supertendent Adress:- "+ Supertendent.address+":");
        System.out.println(":::::::::::::::::::::::::::::::");
    }
    public static void addClgData(){
            collageInformation.collageInformationData();
        }
        public static void addClgFacility(){
        collageInformation.collageFacilityData();
        }
}
