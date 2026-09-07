package Lec07_Strings;

import java.util.Scanner;

public class Ex1_BasicString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        String trimmedLine = line.trim();
        //2 biến String là 2 ô nhớ khác nhau
        System.out.println("Original: [" + line + "]");
        System.out.println("Trimmed: [" + trimmedLine + "]");
        System.out.println("Upper: " + trimmedLine.toUpperCase());
        System.out.println("Lower: " + line.toLowerCase());
        System.out.println("Original length = " + line.length());
        System.out.println("Length after trim = " + trimmedLine.length());
    }
}
