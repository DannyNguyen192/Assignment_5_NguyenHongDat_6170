package Lec07_Strings;

import java.util.Scanner;

public class Ex5_CheckString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        System.out.println("Starts with report: " + fileName.startsWith("report"));
        System.out.println("Ends with report: " + fileName.endsWith(".pdf"));
        System.out.println("First character: " + fileName.charAt(0));
        System.out.println("Last character: " + fileName.charAt(fileName.length()-1));
    }
}
