package codereader.User;


import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student input num ");
        int n = sc.nextInt();
        user u=new user();
        user[] add = new user[n];
        for (int i = 0; i < add.length; i++) {
            add[i]=user.sinput();
        }
        System.out.println(Arrays.toString(add));
    }
}

