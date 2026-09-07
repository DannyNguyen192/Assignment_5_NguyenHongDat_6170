package Lec07_Strings;

import java.util.Scanner;

public class Ex4_Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = sc.next();
        System.out.println("Major code = " + id.substring(0, 2));
        System.out.println("Numeric part = " + id.substring(2));
    }
}
