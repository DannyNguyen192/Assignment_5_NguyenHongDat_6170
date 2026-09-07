package Lec07_Strings;

import java.util.Scanner;

public class Ex7_StringBuilderReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverse(text));
    }

    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
