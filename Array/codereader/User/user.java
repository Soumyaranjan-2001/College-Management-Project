package codereader.User;

import java.util.Scanner;

public class user {
    public static String name;
    public static int rollno;
    private static codereader.User.user user;

    public static user sinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=sc.next();
        System.out.println("Enter rollno: ");
        rollno = sc.nextInt();
        return user;
    }
    public static void sview(){
//        System.out.println(Arrays.toString(input.add);
    }
}
